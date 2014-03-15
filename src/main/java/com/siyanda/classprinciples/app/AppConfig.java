/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.app;

import com.siyanda.classprinciples.service.crud.AtmCrudService;
import com.siyanda.classprinciples.service.crud.AtmCustCrudService;
import com.siyanda.classprinciples.service.crud.impl.AtmCrudServiceImpl;
import com.siyanda.classprinciples.service.crud.impl.AtmCustCrudServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author inathi-zenande
 */
@Configurable
public class AppConfig {
    
    @Bean(name="atmCrudService")
    public AtmCrudService getAtmCrudService(){
        return new AtmCrudServiceImpl();
    }
    
    @Bean(name="atmCustCrudService")
    public AtmCustCrudServiceImpl getAtmCustCrudeService(){
        return new AtmCustCrudServiceImpl();
    }

    
}
