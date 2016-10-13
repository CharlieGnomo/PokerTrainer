/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertrainer;

/**
 *
 * @author Aarón
 */
public enum HandCategories {
    
    HIGH_CARD(),ONE_PAIR(), TWO_PAIR(),THREE_KIND(), STRAIGHT(), FLUSH(),
    FULL_HOUSE(), POKER(), STRAIGHT_FLUSH();
    
    private Value mainV;
    private Value secondV;
    private Suit suit;
    //Cartas que completan la mano
    private Card[] cards;

    

   
    private HandCategories() {
        this.mainV = null;
        this.secondV = null;
        this.suit = null;
        this.cards = null;
    }
    
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
    
     public void setMainV(Value mainV) {
        this.mainV = mainV;
    }

    public void setSecondV(Value secondV) {
        this.secondV = secondV;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getMainV() {
        return mainV;
    }

    public Value getSecondV() {
        return secondV;
    }

    public Suit getSuit() {
        return suit;
    }
    
    
    
    
    
}
