///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmweb.domain;
//
//import java.io.Serializable;
//import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
///**
// *
// * @author inathi-zenande
// */
//@Entity
//public class Transaction implements Serializable {
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String transactionType;
//    
//    @Column(unique = true)
//    private String timer;
//    
//    @Embedded
//    private Withdraw withdraw;
//    @Embedded
//    private Deposit deposit;
//    @Embedded
//    private TranferMoney tranfermoney;
//    
//    @ManyToOne
//    @JoinColumn(name ="airtime_id")
//    List<BuyAirtime> buyairtime;
//
//    public Transaction() {
//    }
//    
//    public Transaction(TransactionInner inner)
//    {
//        id = inner.id;
//        transactionType = inner.transactionType;
//        timer = inner.timer;
//        withdraw = inner.withdraw;
//        deposit = inner.deposit;
//        tranfermoney = inner.tranfermoney;
//        buyairtime =inner.buyairtime;
//    }
//    
//    public static class TransactionInner
//    {
//        private Long id;
//        private String transactionType;
//        private String timer;
//        private Withdraw withdraw;
//        private Deposit deposit;
//        private TranferMoney tranfermoney;
//        List<BuyAirtime> buyairtime;
//        
//        
//        public TransactionInner(String tm) {
//            this.timer=timer;
//        }
//        
//        public TransactionInner id(Long value)
//        {
//            id = value;
//            return this;
//        }
//        public TransactionInner transactionType(String trans)
//        {
//            transactionType = trans;
//            return this;
//        }
//        public TransactionInner withdraw(Withdraw value)
//        {
//            withdraw = value;
//            return this;
//        }
//        public TransactionInner deposit(Deposit value)
//        {
//            deposit = value;
//             return this;
//        }
//        public TransactionInner tranfermoney(TranferMoney value)
//        {
//            tranfermoney = value;
//            return this;
//        }
//        public TransactionInner buyairtime(List<BuyAirtime> value)
//        {
//            buyairtime = value;
//            return this;
//        }
//        
//        public TransactionInner transaction(Transaction t)
//        {
//            id=t.getId();
//            transactionType =t.getTransactionType();
//            timer =t.getTimer();
//            withdraw =t.getWithdraw();
//            deposit =t.getDeposit();
//            tranfermoney =t.getTranfermoney();
//            buyairtime =t.getBuyairtime();
//            return this;
//        }
//        
//        public Transaction transaction()
//        {
//            return new Transaction(this);
//        }
//        
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTransactionType() {
//        return transactionType;
//    }
//
//    public String getTimer() {
//        return timer;
//    }
//
//    public Withdraw getWithdraw() {
//        return withdraw;
//    }
//
//    public Deposit getDeposit() {
//        return deposit;
//    }
//
//    public TranferMoney getTranfermoney() {
//        return tranfermoney;
//    }
//
//    public List<BuyAirtime> getBuyairtime() {
//        return buyairtime;
//    }
//    
//
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
//        hash = 61 * hash + (this.transactionType != null ? this.transactionType.hashCode() : 0);
//        hash = 61 * hash + (this.timer != null ? this.timer.hashCode() : 0);
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
//        final Transaction other = (Transaction) obj;
//        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
//            return false;
//        }
//        if ((this.transactionType == null) ? (other.transactionType != null) : !this.transactionType.equals(other.transactionType)) {
//            return false;
//        }
//        if ((this.timer == null) ? (other.timer != null) : !this.timer.equals(other.timer)) {
//            return false;
//        }
//        return true;
//    }
//
////    @Override
////    public String toString() {
////        return "Transaction{" + "id=" + id + ", transactionType=" + transactionType + ", timer=" + timer + ", withdraw=" + withdraw + ", deposit=" + deposit + ", tranfermoney=" + tranfermoney + ", buyairtime=" + buyairtime + '}';
////    }
//    @Override
//    public String toString() {
//        return "com.siyanda.atmweb.domain.Transaction[ id=" + id + " ]";
//    }
//
//    
//   
//
//}
