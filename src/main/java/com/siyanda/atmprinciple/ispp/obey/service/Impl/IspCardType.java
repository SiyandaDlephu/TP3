/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.ispp.obey.service.Impl;

import com.siyanda.atmprinciple.ispp.obey.service.IspInterfaceAcctype;

/**
 *
 * @author inathi-zenande
 */
public class IspCardType implements IspInterfaceAcctype{

    public String accountType() {
        
        String thisType = "savings";
        
        /*if(accType.equalsIgnoreCase("cheque"))
            thisType ="cheque account";
        else if(accType.equalsIgnoreCase("savings"))
            thisType ="savings account";
        else
            thisType ="No such account found";*/
        
        return thisType;
     
    }
    
}
