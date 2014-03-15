/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.NewBalance;
import com.siyanda.classprinciples.service.crud.NewBalCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class NewBalCrudServiceImpl implements NewBalCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public NewBalance find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public NewBalance persist(NewBalance entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public NewBalance merge(NewBalance entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public NewBalance remove(NewBalance entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<NewBalance> findAll() {
        return null;
    }
    
}
