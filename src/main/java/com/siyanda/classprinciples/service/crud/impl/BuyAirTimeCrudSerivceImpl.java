/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.BuyAirtime;
import com.siyanda.classprinciples.service.crud.BuyAirtimeCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class BuyAirTimeCrudSerivceImpl implements BuyAirtimeCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BuyAirtime find(String id) {
        return null;
    }

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BuyAirtime persist(BuyAirtime entity) {
        return null;
    }

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BuyAirtime merge(BuyAirtime entity) {
        return null;
    }

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BuyAirtime remove(BuyAirtime entity) {
        return null;
    }

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BuyAirtime> findAll() {
        return null;
    }
    
}
