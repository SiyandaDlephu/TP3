/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.repository;

import com.siyanda.atmweb.domain.Atm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface AtmRepository extends JpaRepository<Atm, Long>{
    
}
