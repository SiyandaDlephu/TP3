/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class LostCards {
    private String cardNumber;
    private String identification;

    public LostCards() {
    }

    public LostCards(LostCardsInner inner) {
        this.cardNumber = inner.cardNumber;
        this.identification = inner.identification;
    }

    public static class LostCardsInner
    {
        private String cardNumber;
         private String identification;

        public LostCardsInner(String id) {
            this.identification = id;
        }
        public LostCardsInner cardNumber(String card)
        {
            cardNumber = card;
            return this;
        }
        public LostCardsInner lostcardinner(LostCards lost)
        {
            this.cardNumber = lost.getCardNumber();
            this.identification = lost.getIdentification();
            return this;
        }
        public LostCards lostcards()
        {
            return new LostCards(this);
        }
         
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getIdentification() {
        return identification;
    }
  
}
