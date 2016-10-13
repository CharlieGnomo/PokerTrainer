/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokertrainer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


/**
 *
 * @author usuario_local
 */
public class Board {

    private static LinkedList<Card> deck;
    static final int CARDS_HAND = 5;
    static final int NUMBER_CARDS = 52;
    private int numCardsDeck;
    
    public Board(){
        this.numCardsDeck = NUMBER_CARDS;
    }
 
    public static void main(String[] args) {
        deck = new LinkedList<Card>();
        for (Value val: Value.values()) 
            deck.push(new Card(Suit.HEARTS, val));
        for (Value val: Value.values()) 
            deck.push(new Card(Suit.DIAMONDS, val));
    
        for (Value val: Value.values()) 
            deck.push(new Card(Suit.CLUBS, val));
    
        for (Value val: Value.values()) 
            deck.push(new Card(Suit.SPADES, val)); 
        
        for(int i = 0; i < NUMBER_CARDS; i++) 
            System.out.println(deck.get(i));      
        
        System.out.println(deck.size());
    }
    
    //generamos semillas de random
    private LinkedList<Card> deal(int numCards) {
        LinkedList<Card> cards = new LinkedList<Card>();
        Random rndGenerated = new Random();
        for(int i = 0; i < numCards; i++){
            int rnd = rndGenerated.nextInt(numCardsDeck-1);
            cards.push(deck.get(rnd));
            cards.remove(deck.get(rnd));
        }
        return cards;
    }    
    
    //Suponemos que siempre nos dan el array de cartas ordenado
    //por el valor de la carta (considerando Ace la más alta)
    private void getHand(Card cards[]) {
        //Finalmente devolveré est lista
        ArrayList<Card> finalHand = new ArrayList<Card>(CARDS_HAND);
        int length = cards.length;
        if(length > 0){
            int j = CARDS_HAND-1;
            //Obtenemos la posición en el enumerado de la primera carta
            Card current = cards[0];
            
            int straightCont = 1; 
            int strFlushCont = 1;
            int flushCont = 1;
            int repCont = 1;
            HandCategories bestHand = HandCategories.HIGH_CARD;
            bestHand.setMainV(cards[0].getVal());
            for(int i = 1; i < length; i++) {
                
                
                /////////////BUSCAR PAREJAS//////////////////////////////
                //Si me encuentro varias cartas iguales incremento el contador
                //hasta que me encuentre alguna diferente.
                if(cards[i].getVal() == current.getVal()) {
                    repCont++;
                }
                else {
                    if(repCont == 1) {
                        //Las cartas que aparezcan una sola vez las insertamos 
                        //al final del array finalHand y serán eliminadas
                        //si hay mejores jugadas
                        current = cards[i];
                        
                    }
                    else if(repCont == 2 || repCont == 3 || repCont == 4) {              
                        bestHand = giveMeBestHand(current, repCont, bestHand);
                        repCont = 1;
                        current = cards[i].getVal();
                    }
                }
                
                if(i == length-1 &&(repCont == 2 || repCont == 3 || repCont == 4)){
                    bestHand = giveMeBestHand(current, repCont, bestHand);
                }      
                /////////////FIN BUSCAR PAREJAS//////////////////////////////
                if(cards[i].getSuit() == currentSuit){
                    flushCont++;
                    if(flushCont == 5){
                        bestHand = 
                        decideBetterHand();
                    }
                }
                currentSuit = cards[0].getSuit();
            }

            }

    }
    
    private HandCategories giveMeBestHand(Value current, int repCont, HandCategories bestHand){
        HandCategories currentHand = getCurrentHand(current, repCont);
        bestHand = decideBetterHand(bestHand,currentHand);
        return bestHand;
    }
    
    //Necesito almacenar en algún lugar si he encontrado ya un trio o pareja para saber si la mano que acabo de encontrar es un full o no.
    private HandCategories decideBetterHand(HandCategories bestCurrentHand, HandCategories current) {
       
        HandCategories bestHand;
        //Si había encontrado una pareja y ahora encuentro un trio tengo full.
        if(bestCurrentHand == HandCategories.ONE_PAIR && current == HandCategories.THREE_KIND) {
            bestHand = HandCategories.FULL_HOUSE;
            bestHand.setMainV(current.getMainV());
            bestHand.setSecondV(bestCurrentHand.getMainV());
            
        } 
        //Si había encontrado un trio y ahora encuentro una pareja tengo full.
        else if(bestCurrentHand == HandCategories.THREE_KIND && current == HandCategories.ONE_PAIR) {            
            bestHand = HandCategories.FULL_HOUSE;
            bestHand.setMainV(bestCurrentHand.getMainV());
            bestHand.setSecondV(current.getMainV());
            
        }
            //Si había encontrado una pareja y ahora encuentro una pareja tengo doble pareja.
        else if(bestCurrentHand == HandCategories.ONE_PAIR && current == HandCategories.ONE_PAIR){
            bestHand = HandCategories.TWO_PAIR;
            bestHand.setMainV(bestCurrentHand.getMainV());
            bestHand.setSecondV(current.getMainV());
        }
        
        else if(bestCurrentHand.ordinal() < current.ordinal()) {
            bestHand = current;
        }
        else { 
            bestHand = bestCurrentHand;
        }
        
        return bestHand;
    }   
    
    private HandCategories getCurrentHand(Value val, int cont){
        HandCategories hand = null;
        if(cont == 2) {
            hand = HandCategories.ONE_PAIR;
            hand.setMainV(val);
        }
        else if(cont == 3) {
            hand = HandCategories.THREE_KIND;
            hand.setMainV(val);
        }
        else if(cont == 4) {
            hand = HandCategories.POKER;
            hand.setMainV(val);
        }
        return hand;
    }
}
