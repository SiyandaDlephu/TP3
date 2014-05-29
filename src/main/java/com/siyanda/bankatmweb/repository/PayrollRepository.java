/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.repository;

import com.siyanda.bankatmweb.domain.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inathi-zenande
 */
@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long>{

    public void save(Payroll pay);

    public Payroll findOne(Long id);

    public void delete(Payroll pay);

    public void deleteAll();
}
