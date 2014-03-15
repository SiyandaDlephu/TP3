/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.RegisterPhone;
import com.siyanda.classprinciples.service.crud.RegisterPhoneCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class RegisterPhoneCrudServiceImpl  implements RegisterPhoneCrudService{
    
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public RegisterPhone find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public RegisterPhone persist(RegisterPhone entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public RegisterPhone merge(RegisterPhone entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public RegisterPhone remove(RegisterPhone entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<RegisterPhone> findAll() {
        return null;
    }

   
}
