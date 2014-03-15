/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.Withdraw;
import com.siyanda.classprinciples.service.crud.WithdrawCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class WithdrawCrudServiceImpl implements WithdrawCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Withdraw find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Withdraw persist(Withdraw entity) {
       return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Withdraw merge(Withdraw entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Withdraw remove(Withdraw entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Withdraw> findAll() {
        return null;
    }
    
}
