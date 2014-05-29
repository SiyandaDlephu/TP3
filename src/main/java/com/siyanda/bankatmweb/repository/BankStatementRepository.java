/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.BankStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface BankStatementRepository extends JpaRepository<BankStatement, Long> {

    public void save(BankStatement bank);

    public BankStatement findOne(Long id);

    public void delete(BankStatement bank);
    
}
