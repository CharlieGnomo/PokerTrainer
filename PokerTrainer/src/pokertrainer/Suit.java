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
public enum Suit {
    
    HEARTS("h"), DIAMONDS("d"), CLUBS("c"), SPADES("s");

    
    private String name;
    
    private Suit(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
            
}
