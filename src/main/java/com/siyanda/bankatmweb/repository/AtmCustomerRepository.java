/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.AtmCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface AtmCustomerRepository extends JpaRepository<AtmCustomer,Long>{

    public void save(AtmCustomer atmcust);

    public AtmCustomer findOne(Long id);

    public void delete(AtmCustomer atmcust);
    
}
