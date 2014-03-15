/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.WithdrawAccount;
import com.siyanda.classprinciples.service.crud.WithdrawAccountCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class WithdrawAccountCrudServiceImpl implements WithdrawAccountCrudService{
    
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public WithdrawAccount find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public WithdrawAccount persist(WithdrawAccount entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public WithdrawAccount merge(WithdrawAccount entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public WithdrawAccount remove(WithdrawAccount entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<WithdrawAccount> findAll() {
        return null;
    }

   
}
