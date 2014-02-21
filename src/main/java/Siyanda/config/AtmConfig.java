/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Siyanda.config;

import Siyanda.service.Impl.SiyandaServiceImpl;
import Siyanda.service.SiyandaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Fifi
 */
@Configuration
public class AtmConfig {
    @Bean(name="assMessage") 
    public SiyandaService assertMessage() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="balan") 
    public SiyandaService balance() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="accNum") 
    public SiyandaService accountNumber() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="objectEq") 
    public SiyandaService objectEquals() {
            return new SiyandaServiceImpl();
    }
    @Bean(name="objectIdent") 
    public SiyandaService objectIdentity() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="truthWith") 
    public SiyandaService truthWithdraw() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="falsity") 
    public SiyandaService falsityNoMoney() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="nullP") 
    public SiyandaService nullPin() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="NotnullP") 
    public SiyandaService notNullPin() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="failP") 
    public SiyandaService failPin() {
            return new SiyandaServiceImpl();
    }
    
    @Bean(name="exceptionWrong") 
    public SiyandaService exceptionWrongPin() {
            return new SiyandaServiceImpl();
    }
    @Bean(name="timeO") 
    public SiyandaService timeout() {
            return new SiyandaServiceImpl();
    }
}
