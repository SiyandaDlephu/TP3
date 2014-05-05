///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmweb.domain;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
///**
// *
// * @author inathi-zenande
// */
//@Entity
//public class CardLess implements Serializable {
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//     @Column(unique = false)
//     private String timer;
//     
//    @Embedded
//    private LostCard lostcard;
//    @Embedded
//    private Ewallet ewallet;
//
//    public CardLess() {
//    }
//    
//    public CardLess(CardLessInner card)
//    {
//        id = card.id;
//        timer = card.timer;
//        lostcard = card.lostcard;
//        ewallet = card.ewallet;
//    }
//    
//    public static class CardLessInner
//    {
//        private Long id;
//        private String timer;
//        private LostCard lostcard;
//        private Ewallet ewallet;
//
//        public CardLessInner(String timer) {
//            this.timer=timer;
//        }
//
//         public CardLessInner id(Long value)
//         {
//             id = value;
//             return this;
//         }
//         public CardLessInner ewallet(Ewallet value)
//         {
//             ewallet = value;
//             return this;
//         }
//         
//          public CardLessInner lostcard(LostCard tim)
//          {
//              lostcard = tim;
//              return this;
//          }
//          public CardLessInner cardLess(CardLess cl)
//          {
//              id = cl.getId();
//              timer = cl.getTimer();
//              lostcard =cl.getLostcard();
//              ewallet =cl.getEwallet();
//              return this;
//          }
//          
//          public CardLess cardless()
//          {
//              return new CardLess(this);
//          }
//                 
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTimer() {
//        return timer;
//    }
//
//    public LostCard getLostcard() {
//        return lostcard;
//    }
//
//    public Ewallet getEwallet() {
//        return ewallet;
//    }
//    
//
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
//        hash = 17 * hash + (this.timer != null ? this.timer.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final CardLess other = (CardLess) obj;
//        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
//            return false;
//        }
//        if ((this.timer == null) ? (other.timer != null) : !this.timer.equals(other.timer)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.siyanda.atmweb.domain.CardLess[ id=" + id + " ]";
//    }
//
//   
//}
