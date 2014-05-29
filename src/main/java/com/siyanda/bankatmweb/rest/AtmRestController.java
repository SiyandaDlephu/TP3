/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.rest;

import com.siyanda.bankatmweb.domain.Atm;
import com.siyanda.bankatmweb.services.AtmService;
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
@RequestMapping(value = "api/atm") // This the url e.g http://localhost:8084/askweb/api/club
public class AtmRestController {
    
    @Autowired
    private AtmService atmService;
    
//
//    @RequestMapping(value = "create",method = RequestMethod.POST) // This the uri e.g http://localhost:8084/askweb/api/club/create
//    @ResponseBody //Converts output or response to JSON String
//    public String create(@RequestBody Atm atm) { // @RequestBody for converting incoming JSON call to Object
//        atmService.persist(atm);
//        
//        System.out.println(" Create the Called ");
//        return "Club Created";
//    }

    @RequestMapping(value = "update",method = RequestMethod.PUT) //This the uri e.g http://localhost:8084/askweb/api/club/update
    @ResponseBody
    public String update(@RequestBody Atm atm) {
        atmService.merge(atm);
        System.out.println(" Update Called ");
        return "Club Update";
    }

    @RequestMapping(value = "id/{id}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/1234
    @ResponseBody
    public Atm getClub(@PathVariable Long id) { //@PathVariable used to bind the id value
        
        System.out.println(" ID called ");
        return atmService.find(id);
    }

    @RequestMapping(value = "clubs",method = RequestMethod.GET) // Always Put HTTP Method
    @ResponseBody
    public List<Atm> getClubs() {
        System.out.println("The CLUBS");
        return atmService.findAll();
    }

    @RequestMapping(value = "name/{name}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/football
    @ResponseBody
    public Atm getClubByName(@PathVariable String name) {
        Atm atm = atmService.getAtmByName(name); // Call the Service;
        if(atm!=null){
            return atm;
        }
        return null;
    }
    
}
