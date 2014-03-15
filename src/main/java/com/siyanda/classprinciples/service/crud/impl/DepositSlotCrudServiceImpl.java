/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud.impl;

import com.siyanda.classprinciples.model.CardValidation;
import com.siyanda.classprinciples.model.CashDispanser;
import com.siyanda.classprinciples.model.DepositSlot;
import com.siyanda.classprinciples.service.crud.DepositSlotCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inathi-zenande
 */
public class DepositSlotCrudServiceImpl implements DepositSlotCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public DepositSlot find(String id) {
        return null;
    }

    @Override
    @Transactional (propagation = Propagation.MANDATORY)
    public DepositSlot persist(DepositSlot entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DepositSlot merge(DepositSlot entity) {
        return null;
    }

    @Override
    @Transactional (propagation =Propagation.REQUIRED)
    public DepositSlot remove(DepositSlot entity) {
        return null;
    }

    @Override
    @Transactional (propagation = Propagation.SUPPORTS)
    public List<DepositSlot> findAll() {
        return null;
    }

    public CardValidation persist(CashDispanser cd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
