/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.Screen;
import com.siyanda.classprinciples.service.crud.ScreenCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class ScreenCrudServiceImpl implements ScreenCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Screen find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Screen persist(Screen entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Screen merge(Screen entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Screen remove(Screen entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Screen> findAll() {
        return null;
    }

    
}
