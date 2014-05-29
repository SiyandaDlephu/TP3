/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Address;
import com.siyanda.bankatmweb.domain.Contact;
import com.siyanda.bankatmweb.domain.Person;
import com.siyanda.bankatmweb.repository.PersonRepository;
import static com.siyanda.bankatmweb.test.repository.PayrollRepositoryTest.ctx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class PersonRepositoryTest {
    
   public static ApplicationContext ctx;
    private Long id;
    private PersonRepository repo;
    private Person person;
    
    private static Address address;
    private static Contact contact;
    
    public PersonRepositoryTest() {
    }
    
    @Test
    public void createPerson()
    {
        repo = ctx.getBean(PersonRepository.class);

         person = new Person
                .PersonInner("1223344455555")
                .firstName("zenande")
                .surname("yam")
                .gender("male")
                .contact(contact)
                .address(address)                
                .person();
                

        repo.save(person);
        id = person.getId();
        Assert.assertNotNull(person);
    }

    @Test(dependsOnMethods="createPerson")
    public void readPerson()
    {
        repo = ctx.getBean(PersonRepository.class);
        Person person = repo.findOne(id);
        Assert.assertEquals(person.getIdentification(),"1223344455555");
    }
    
    @Test(dependsOnMethods="readPerson")
    public void updatePerson()
    {
        repo = ctx.getBean(PersonRepository.class);
        Person person = repo.findOne(id);
        
        Address address = new Address
                .AddreeInner(111)
                .street("lower main")
                .town("karukaru")
                .province("eastern cape")
                .country("south africa")
                .address();
        
        Contact contact = new Contact
                .ContactInner("071234567")
                .name("hilary")
                .emailAddress("hilary@gmail.com")
                .contact();
        
       
        Person updatePerson = new Person
                .PersonInner("555554444333221")
                .firstName("inathi")
                .surname("dlukuku")
                .gender("male")
                .contact(contact)
                .address(address)                
                .person();

        
        repo.save(updatePerson);
        
        Person newPerson = repo.findOne(id);
        Assert.assertEquals(newPerson.getSurname(),"1223344455555");
    }
    
    @Test(dependsOnMethods="updatePerson")
    public void deletePerson()
    {
        repo = ctx.getBean(PersonRepository.class);
        Person person = repo.findOne(id);
        repo.delete(person);
        
        Person deletedPerson = repo.findOne(id);
        Assert.assertNull(deletedPerson);
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
        
        address = new Address
                .AddreeInner(111)
                .street("lower street")
                .town("cape town")
                .province("western cape")
                .country("south africa")
                .address();
        
         contact = new Contact
                .ContactInner("071234567")
                .name("siyanda")
                .emailAddress("sdlephu@gmail.com")
                .contact();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
