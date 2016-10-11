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
public enum Value {
    
     ACE("A"), KING("K"), QUEEN("Q"), JACK("J"),TEN("T"), NINE("9"), EIGHT("8"), SEVEN("7"),
        SIX("6"), FIVE("5"), FOUR("4"), THREE("3"),TWO("2");
    
    private String val;
    
    private Value(String val) {
        this.val = val;
    }
    
    public String getVal() {
        return this.val;
    }
    
}
