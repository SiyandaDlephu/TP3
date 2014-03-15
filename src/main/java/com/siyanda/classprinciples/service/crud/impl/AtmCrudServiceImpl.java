/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.Atm;

import com.siyanda.classprinciples.service.crud.AtmCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class AtmCrudServiceImpl implements AtmCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Atm find(String id) {
        return null;    
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Atm persist(Atm entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Atm merge(Atm entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Atm remove(Atm entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Atm> findAll() {
        return null;
    }
    
}
