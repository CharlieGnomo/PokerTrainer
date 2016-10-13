package pokertrainer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario_local
 */
public class Card {
    
    private final Suit suit;
    private final Value val;
    
    
    public Card(Suit suit, Value val) {
        this.suit = suit;
        this.val = val;
        
    }
    
    public Suit getSuit() {
        return this.suit;
    }
    
    public Value getVal() {
        return this.val;
    }
    
    @Override
    public String toString(){
        return (this.val.getVal() + this.suit.getName());
    }
}

