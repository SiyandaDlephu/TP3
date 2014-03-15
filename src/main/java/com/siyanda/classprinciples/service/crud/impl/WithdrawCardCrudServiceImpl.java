/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.WithdrawCard;
import com.siyanda.classprinciples.service.crud.WithdrawCardCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class WithdrawCardCrudServiceImpl implements WithdrawCardCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public WithdrawCard find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public WithdrawCard persist(WithdrawCard entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public WithdrawCard merge(WithdrawCard entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public WithdrawCard remove(WithdrawCard entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<WithdrawCard> findAll() {
        return null;
    }
    
}
