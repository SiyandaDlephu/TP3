/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;


import com.siyanda.classprinciples.model.Deposite;
import com.siyanda.classprinciples.service.crud.DepositCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class DepositeCrudServiceImpl implements DepositCrudService{
    
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Deposite find(String id) {
        return null;
    }

    @Override
    @Transactional (propagation = Propagation.MANDATORY)
    public Deposite persist(Deposite entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Deposite merge(Deposite entity) {
        return null;
    }

    @Override
    @Transactional (propagation =Propagation.REQUIRED)
    public Deposite remove(Deposite entity) {
        return null;
    }

    @Override
    @Transactional (propagation = Propagation.SUPPORTS)
    public List<Deposite> findAll() {
        return null;
    }
   
    
}
