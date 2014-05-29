/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.restapi;

import com.siyanda.bankatmweb.domain.Account;
import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class AccountRestControllerTest {
    
    private final RestTemplate restTemplate = new RestTemplate();
    private final static String URL = "http://localhost:8084/bankatmweb/";
    
    //    @Test
    public void tesCreate() {
        Account account = new Account.AccountInner("Hackers").account();
        HttpEntity<Account> requestEntity = new HttpEntity<>(account, getContentType());
//        Make the HTTP POST request, marshaling the request to JSON, and the response to a String
        ResponseEntity<String> responseEntity = restTemplate.
                exchange(URL + "api/club/create", HttpMethod.POST, requestEntity, String.class);
        System.out.println(" THE RESPONSE BODY " + responseEntity.getBody());
        System.out.println(" THE RESPONSE STATUS CODE " + responseEntity.getStatusCode());
        System.out.println(" THE RESPONSE IS HEADERS " + responseEntity.getHeaders());
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);

    }
    
    @Test
    public void tesClubUpdate() {
        // LEFT AS AN EXERCISE FOR YOU
        // GET THE CLUB and THEN CHANGE AND MAKE A COPY
        //THEN SEND TO THE SERVER USING A PUT OR POST
        // THEN READ BACK TO SEE IF YOUR CHANGE HAS HAPPENED
        Account account = new Account.AccountInner("Hackers").account();
        HttpEntity<Account> requestEntity = new HttpEntity<>(account, getContentType());
//        Make the HTTP POST request, marshaling the request to JSON, and the response to a String
        ResponseEntity<String> responseEntity = restTemplate.
                exchange(URL + "api/club/create", HttpMethod.POST, requestEntity, String.class);
        System.out.println(" THE RESPONSE BODY " + responseEntity.getBody());
        System.out.println(" THE RESPONSE STATUS CODE " + responseEntity.getStatusCode());
        System.out.println(" THE RESPONSE IS HEADERS " + responseEntity.getHeaders());
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);

    }
    
    public void testreadClubByNameName() {
        String accountName = "savings";
        HttpEntity<?> requestEntity = getHttpEntity();
        ResponseEntity<Account> responseEntity = restTemplate.exchange(URL + "api/club/name/" + accountName, HttpMethod.GET, requestEntity, Account.class);
        Account account = responseEntity.getBody();

        Assert.assertNotNull(account);

    }
    
     @Test
    public void testreadClubById() {
        String clubId = "2";
        HttpEntity<?> requestEntity = getHttpEntity();
        ResponseEntity<Account> responseEntity = restTemplate.exchange(URL + "api/club/id/" + clubId, HttpMethod.GET, requestEntity, Account.class);
        Account account = responseEntity.getBody();

        Assert.assertNotNull(account);

    }
    
     @Test
    public void testgetAllClubs() {
        HttpEntity<?> requestEntity = getHttpEntity();
        ResponseEntity<Account[]> responseEntity = restTemplate.exchange(URL + "api/account/accounts", HttpMethod.GET, requestEntity, Account[].class);
        Account[] clubs = responseEntity.getBody();
        for (Account club : clubs) {
           // System.out.println("The Club Name is " + Account.getName());

        }

        Assert.assertTrue(clubs.length > 0);
    }
    
    private HttpEntity<?> getHttpEntity() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
        HttpEntity<?> requestEntity = new HttpEntity<>(requestHeaders);
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return requestEntity;
    }

    private HttpHeaders getContentType() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(new MediaType("application", "json"));
        return requestHeaders;

    }
}
