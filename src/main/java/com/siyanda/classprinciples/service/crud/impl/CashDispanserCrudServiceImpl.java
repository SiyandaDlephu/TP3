/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.CashDispanser;
import com.siyanda.classprinciples.service.crud.CashDispanserCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class CashDispanserCrudServiceImpl implements CashDispanserCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CashDispanser find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CashDispanser persist(CashDispanser entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CashDispanser merge(CashDispanser entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CashDispanser remove(CashDispanser entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CashDispanser> findAll() {
        return null;
    }
    
}
