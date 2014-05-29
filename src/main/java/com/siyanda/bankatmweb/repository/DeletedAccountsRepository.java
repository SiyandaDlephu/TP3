/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.DeletedAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface DeletedAccountsRepository extends JpaRepository<DeletedAccounts, Long>{

    public void save(DeletedAccounts deletedaccounts);

    public DeletedAccounts findOne(Long id);

    public void delete(DeletedAccounts deletedaccounts);
    
}
