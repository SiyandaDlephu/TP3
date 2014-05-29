/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.rest;

import com.siyanda.bankatmweb.domain.Bank;
import com.siyanda.bankatmweb.services.BankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author inathi-zenande
 */
@Controller  // Annotation to make this class be detectable by the config as a controller
@RequestMapping(value = "api/bank")
public class BankRestController {
    
    @Autowired
    private BankService bankservice;
    

    @RequestMapping(value = "create",method = RequestMethod.POST) // This the uri e.g http://localhost:8084/askweb/api/club/create
    @ResponseBody //Converts output or response to JSON String
    public String create(@RequestBody BankService bank) { // @RequestBody for converting incoming JSON call to Object
        bankservice.persist(bank);
        
        System.out.println(" Create the Called ");
        return "Club Created";
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT) //This the uri e.g http://localhost:8084/askweb/api/club/update
    @ResponseBody
    public String update(@RequestBody BankService bank) {
        bankservice.merge(bank);
        System.out.println(" Update Called ");
        return "bank Update";
    }

    @RequestMapping(value = "id/{id}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/1234
    @ResponseBody
    public BankService getClub(@PathVariable Long id) { //@PathVariable used to bind the id value
        
        System.out.println(" ID called ");
        return bankservice.find(id);
    }

    @RequestMapping(value = "clubs",method = RequestMethod.GET) // Always Put HTTP Method
    @ResponseBody
    public List<Bank> getClubs() {
        System.out.println("The bank");
        return bankservice.findAll();
    }

    @RequestMapping(value = "name/{name}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/football
    @ResponseBody
    public Bank getClubByName(@PathVariable String name) {
        Bank bank = (Bank) bankservice.getBankName(name); // Call the Service;
        if(bank!=null){
            return bank;
        }
        return null;
    }
    
}
