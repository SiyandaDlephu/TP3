/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.CardValidation;
import com.siyanda.classprinciples.service.crud.CardValiCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class CardValiCrudServiceImpl implements CardValiCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CardValidation find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation =Propagation.MANDATORY)
    public CardValidation persist(CardValidation entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CardValidation merge(CardValidation entity) {
        return null;
    }

     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CardValidation remove(CardValidation entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CardValidation> findAll() {
       return null;
    }
    
}
