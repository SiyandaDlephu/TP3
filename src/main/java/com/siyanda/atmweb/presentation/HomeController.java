/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.presentation;

import com.siyanda.atmweb.domain.AtmCustomer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author inathi-zenande
 */
@Controller
public class HomeController {
    
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String getIndex()
    {
        return "index";
    }
    
    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    @ResponseBody
    public List<AtmCustomer> getRndex()
    {
        List<AtmCustomer> atmcustomer = new ArrayList<>();
        
        AtmCustomer atmcust1 = new AtmCustomer.Customer("1234")
                .firstname("Zenande")
                .atmcust();
        AtmCustomer atmcust2 = new AtmCustomer.Customer("5555")
                .firstname("Zenande")
                .atmcust();
        AtmCustomer atmcust3 = new AtmCustomer.Customer("1010")
                .firstname("Lamar")
                .atmcust();
        
        atmcustomer.add(atmcust1);
        atmcustomer.add(atmcust2);
        atmcustomer.add(atmcust3);
        
        return atmcustomer;
    }
    
    
}
