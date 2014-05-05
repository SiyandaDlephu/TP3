///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmweb.services.Impl;
//
//import com.siyanda.atmweb.domain.Atm;
//import com.siyanda.atmweb.repository.AtmRepository;
//import com.siyanda.atmweb.services.AtmService;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// *
// * @author inathi-zenande
// */
//public class AtmServiceImpl implements AtmService{
//
//    @Autowired
//    private AtmRepository atmRepository;
//    
//    @Override
//    public List<Atm> isAuthorizedUser(boolean user) {
//       List<Atm> atms = new ArrayList<>();
//       List<Atm> allAtm = atmRepository.findAll();
//       
//       for(Atm atm: allAtm)
//       {
//           if(atm.isUserAuthorized()==true)
//           {
//               atms.add(atm);
//           }
//       }
//       return atms;
//    }
//    
//}
