/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.config;

import com.siyanda.atmprinciple.dip.obey.service.DipInterface;
import com.siyanda.atmprinciple.dip.obey.service.Impl.DipServiceImpl;
import com.siyanda.atmprinciple.dip.violation.service.Impl.DIpVIolationImpl;
import com.siyanda.atmprinciple.ispp.obey.service.Impl.ClientInfo;
import com.siyanda.atmprinciple.ispp.obey.service.Impl.IspCardType;
import com.siyanda.atmprinciple.ispp.obey.service.IspInterfaceAcctype;
import com.siyanda.atmprinciple.ispp.obey.service.IspInterfaceBal;
import com.siyanda.atmprinciple.ispp.violation.service.Impl.IsppViolationAccount;
import com.siyanda.atmprinciple.ocp.obey.service.AtmInterface;
import com.siyanda.atmprinciple.ocp.obey.service.Impl.AtmServiceImpl;
import com.siyanda.atmprinciple.srp.obey.service.Impl.SrpServiceImpl;
import com.siyanda.atmprinciple.srp.obey.service.SrpInterface;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author inathi-zenande
 */
public class AtmConfig {
    
    @Bean(name="withdraw") 
    public DipInterface withDrawNewBal() {
            return new DipServiceImpl();
    }
    @Bean(name="withdraw2")
    public DIpVIolationImpl withdrawNewBal()
    {
        return new DIpVIolationImpl();
    }
    
    @Bean(name = "accType")
    public IspInterfaceAcctype accountType()
    {
        return new IspCardType();
    }
    
    @Bean(name ="balanc")
    public IspInterfaceAcctype balance()
    {
        return new ClientInfo();
    }
    
    @Bean(name = "ocp")
    public AtmInterface newAccount()
    {
        return new AtmServiceImpl();
    }
}
