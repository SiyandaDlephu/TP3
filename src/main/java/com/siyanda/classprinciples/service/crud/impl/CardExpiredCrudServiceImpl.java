/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.CardExpired;
import com.siyanda.classprinciples.service.crud.CardExpiredCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class CardExpiredCrudServiceImpl implements CardExpiredCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CardExpired find(String id) {
        return null;
    }

     @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CardExpired persist(CardExpired entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CardExpired merge(CardExpired entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CardExpired remove(CardExpired entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CardExpired> findAll() {
        return null;
    }
    
}
