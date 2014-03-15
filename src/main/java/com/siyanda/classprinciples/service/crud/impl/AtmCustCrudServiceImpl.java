/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;


import com.siyanda.classprinciples.model.AtmCustomer;
import com.siyanda.classprinciples.service.CrudService;
import com.siyanda.classprinciples.service.crud.AtmCrudService;
import com.siyanda.classprinciples.service.crud.AtmCustCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class AtmCustCrudServiceImpl implements AtmCustCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AtmCustomer find(String id) {
        return null;
        
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AtmCustomer persist(AtmCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AtmCustomer merge(AtmCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AtmCustomer remove(AtmCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AtmCustomer> findAll() {
        return null;
    }
    
}
