/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services;

import com.siyanda.bankatmweb.domain.Atm;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
public interface AtmService {
     public List<Atm> getAtm(String atmLOcation);
     public List<Atm> getChangePin(String newPin);
    // public List<Atm> cardValidate(boolean check);
     public List<Atm> message(String massege);

    public void persist(Atm atm);

    public void merge(Atm atm);

    public List<Atm> findAll();

    public Atm getClubByName(String name);

    public Atm find(Long id);

    public Atm getAtmByName(String name);
}
