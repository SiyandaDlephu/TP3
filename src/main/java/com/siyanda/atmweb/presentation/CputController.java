/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.presentation;

import com.siyanda.atmweb.domain.AtmCustomer;
import com.siyanda.atmweb.services.AtmCustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author inathi-zenande
 */
@Controller
public class CputController {
    @Autowired
    private AtmCustomerService customerService;
    @RequestMapping(value = "cput",method = RequestMethod.GET)
    public String getHome()
    {
        List<AtmCustomer> amtcustomer = customerService.getFirstName("Siyanda");
        
         System.out.println(" The CPUT COntroller was hit" +amtcustomer.size());
        
        return "cput";
    }    
    
   @RequestMapping(value = "cput/students",method = RequestMethod.GET)
    public String getStudents(Model model){
        
        
        model.addAttribute("name1", "This is a Student Name");
        
        return "students";
    }
}
