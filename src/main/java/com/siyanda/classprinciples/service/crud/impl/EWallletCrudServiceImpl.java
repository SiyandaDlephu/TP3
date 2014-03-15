/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.EWalllet;
import com.siyanda.classprinciples.service.crud.EWallletCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class EWallletCrudServiceImpl implements EWallletCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public EWalllet find(String id) {
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public EWalllet persist(EWalllet entity) {
        return null;
    }

     @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public EWalllet merge(EWalllet entity) {
        return null;
    }

     @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public EWalllet remove(EWalllet entity) {
        return null;
    }

     @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<EWalllet> findAll() {
        return null;
    }
    
}
