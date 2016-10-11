/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokertrainer;

import java.util.Random;






/**
 *
 * @author usuario_local
 */
public class PokerTrainer {

    
    private static Card[] deck = {
            new Card(Suit.HEARTS,Value.ACE),new Card(Suit.HEARTS,Value.KING),new Card(Suit.HEARTS,Value.QUEEN),new Card(Suit.HEARTS,Value.JACK),new Card(Suit.HEARTS,Value.TEN),new Card(Suit.HEARTS,Value.NINE),new Card(Suit.HEARTS,Value.EIGHT),new Card(Suit.HEARTS,Value.SEVEN),new Card(Suit.HEARTS,Value.SIX),new Card(Suit.HEARTS,Value.FIVE),new Card(Suit.HEARTS,Value.FOUR),new Card(Suit.HEARTS,Value.THREE),new Card(Suit.HEARTS,Value.TWO),
            new Card(Suit.DIAMONDS,Value.ACE),new Card(Suit.DIAMONDS,Value.KING),new Card(Suit.DIAMONDS,Value.QUEEN),new Card(Suit.DIAMONDS,Value.JACK),new Card(Suit.DIAMONDS,Value.TEN),new Card(Suit.DIAMONDS,Value.NINE),new Card(Suit.DIAMONDS,Value.EIGHT),new Card(Suit.DIAMONDS,Value.SEVEN),new Card(Suit.DIAMONDS,Value.SIX),new Card(Suit.DIAMONDS,Value.FIVE),new Card(Suit.DIAMONDS,Value.FOUR),new Card(Suit.DIAMONDS,Value.THREE),new Card(Suit.DIAMONDS,Value.TWO),
            new Card(Suit.CLUBS,Value.ACE),new Card(Suit.CLUBS,Value.KING),new Card(Suit.CLUBS,Value.QUEEN),new Card(Suit.CLUBS,Value.JACK),new Card(Suit.CLUBS,Value.TEN),new Card(Suit.CLUBS,Value.NINE),new Card(Suit.CLUBS,Value.EIGHT),new Card(Suit.CLUBS,Value.SEVEN),new Card(Suit.CLUBS,Value.SIX),new Card(Suit.CLUBS,Value.FIVE),new Card(Suit.CLUBS,Value.FOUR),new Card(Suit.CLUBS,Value.THREE),new Card(Suit.CLUBS,Value.TWO),
            new Card(Suit.SPADES,Value.ACE),new Card(Suit.SPADES,Value.KING),new Card(Suit.SPADES,Value.QUEEN),new Card(Suit.SPADES,Value.JACK),new Card(Suit.SPADES,Value.TEN),new Card(Suit.SPADES,Value.NINE),new Card(Suit.SPADES,Value.EIGHT),new Card(Suit.SPADES,Value.SEVEN),new Card(Suit.SPADES,Value.SIX),new Card(Suit.SPADES,Value.FIVE),new Card(Suit.SPADES,Value.FOUR),new Card(Suit.SPADES,Value.THREE),new Card(Suit.SPADES,Value.TWO),
    };
    /**
     * @param args the command line arguments
     */

    static final int NUMBER_CARDS = 52;
 
    public static void main(String[] args) {
        
        System.out.println("C:\\hlocal\\hja\\" + deck[0].getVal().getVal() + deck[0].getSuit().getName() + ".png");
        System.out.println("C:\\hlocal\\hja\\" + deck[13].getVal().getVal() + deck[13].getSuit().getName() + ".png");
        
        
    }
    
    public void shuffle(){
        Random randomGenerator = new Random();
        Card[] c = deck.clone();
        Card card;
        for(int i = 0; i < NUMBER_CARDS; i++){
            int randomInt = randomGenerator.nextInt(NUMBER_CARDS-1);
            card = c[randomInt];
            c[randomInt] = c[i];
            c[i] = card;
        }
        for(int i = 0; i < NUMBER_CARDS; i++)
            System.out.print(c[i].toString() + "-");
        System.out.println(" ");
        for(int i = 0; i < NUMBER_CARDS; i++)
            System.out.print(deck[i].toString() + "-");
    }
    
}
