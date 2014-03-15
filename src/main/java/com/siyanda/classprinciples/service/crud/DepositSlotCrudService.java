/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.service.crud;

import com.siyanda.classprinciples.model.CardValidation;
import com.siyanda.classprinciples.model.CashDispanser;
import com.siyanda.classprinciples.model.DepositSlot;
import com.siyanda.classprinciples.service.CrudService;

/**
 *
 * @author inathi-zenande
 */
public interface DepositSlotCrudService extends CrudService<DepositSlot, String>{

    public CardValidation persist(CashDispanser cd);

 //   public void persist(CashDispanser cd);
    
}
