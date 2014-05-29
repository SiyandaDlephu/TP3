/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.Atm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface AtmRepository extends JpaRepository<Atm,Long>{

    public void save(Atm atm);

    public Atm findOne(Long id);

    public void delete(Atm atm);

    public void deleteAll();

}
