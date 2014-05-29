/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.Ewallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface EwalletRepository extends JpaRepository<Ewallet, Long>{

    public void save(Ewallet ewallet);

    public Ewallet findOne(Long id);

    public void delete(Ewallet ewallet);

    public void deleteAll();
    
}
