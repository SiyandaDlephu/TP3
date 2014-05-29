/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Atm;
import com.siyanda.bankatmweb.repository.AtmRepository;
import com.siyanda.bankatmweb.services.TotalAtmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */ 
@Service
public class TotalAtmServiceImpl implements TotalAtmService{

    @Autowired
    private AtmRepository atmRepository;
    
    @Override
    public List<Atm> getTotalAtm() {
        
        return atmRepository.findAll();
    }
    
}
