/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Atm;
import com.siyanda.bankatmweb.repository.AtmRepository;
import com.siyanda.bankatmweb.services.AtmService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class AtmServiceImpl implements AtmService{

    @Autowired
    private AtmRepository repo;
    
    @Override
    public List<Atm> getAtm(String atmLOcation) {
       
        List<Atm> atms = new ArrayList<>();
        List<Atm> allFNB = repo.findAll();
        
        for(Atm atm : allFNB)
        {
            if(atm.getAtmLocation() == atmLOcation)
            {
                 allFNB.add(atm);
            }
        }
        return allFNB;
    }   

    @Override
    public List<Atm> getChangePin(String newPin) {
        
        List<Atm> changepin = new ArrayList<>();
        List<Atm> allChange = repo.findAll();
        
        for(Atm atm :allChange)
        {
            if(atm.getChangePin() == newPin)
            {
                allChange.add(atm);
            }
        }
        return allChange;
    }

//    @Override
//    public List<Atm> cardValidate(boolean check) {
//        
//        List<Atm> validate = new ArrayList<>();
//        List<Atm> allvalidation = repo.findAll();
//        
//        for(Atm atm :allvalidation)
//        {
//            if(atm.isVardcalidation()== check)
//            {
//                allvalidation.add(atm);
//            }
//        }
//        return allvalidation;
//    }

    @Override
    public List<Atm> message(String massege) {
       
        List<Atm> mass = new ArrayList<>();
        List<Atm> allMessage= repo.findAll();
        
        for(Atm atm :allMessage)
        {
            if(atm.getScreen()== massege)
            {
                allMessage.add(atm);
            }
        }
        return allMessage;
    }

    @Override
    public void persist(Atm atm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(Atm atm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Atm> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Atm getClubByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Atm find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Atm getAtmByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
