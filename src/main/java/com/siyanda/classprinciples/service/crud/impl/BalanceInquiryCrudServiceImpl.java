/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.Atm;
import com.siyanda.classprinciples.model.BalanceInquiry;
import com.siyanda.classprinciples.service.crud.AtmCrudService;
import com.siyanda.classprinciples.service.crud.BalanceInquCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class BalanceInquiryCrudServiceImpl implements BalanceInquCrudService {
    

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BalanceInquiry find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public BalanceInquiry persist(BalanceInquiry entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BalanceInquiry merge(BalanceInquiry entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public BalanceInquiry remove(BalanceInquiry entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<BalanceInquiry> findAll() {
        return null;
    }

   
    
}
