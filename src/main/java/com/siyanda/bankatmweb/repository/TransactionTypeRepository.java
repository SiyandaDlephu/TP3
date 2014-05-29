/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionType, Long>{

    public void save(TransactionType type);

    public void delete(TransactionType type);

    public TransactionType findOne(Long id);
    
}
