/*
 * Create a deck of cards, shuffle the deck and print the first 
 * four cards.  
 * Sean O'Brien
 */

package deckofcards;

public class DeckOfCards {

    public static void main(String[] args) {

        // Create an array of 52 indexes
        // Will keep using integer i because of scope
        int[] deck = new int[52];

        /* Basic Algorithm
         * How to go from number to a card type/rank:
         * 52 cards, 4 suits, 13 ranks.  Use integer division, 
         * divide 52 by 13 = suit
         * rank = 52 % 13 = range of 0 to 12
         */
        
        // Now, statically declare two more arrays, one for suits, one for ranks
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

        /* Initialize the deck with a for loop.  It is better practice to 
         * use the '.length' instead of the size of array we know
         */
        for (int i = 0; i < deck.length; i++) {
            /* Loop from 0 to 51.  
             * for each consecutive element in the array, that element
             * will get that number
             */
            deck[i] = i;
        }

        // Shuffle the deck with another for loop
        for (int i = 0; i < deck.length; i++) {
            // for each card value, create a random index
            // random is a double, so will need to type cast to 'int'
            int index = (int) (Math.random() * deck.length);
            // Swap element at array index i with element at array index random

            // Swap with temp
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Print out first four cards, use a 'for' loop
        for (int i = 0; i < 4; i++) {
            // Now use alg to get the strings that represent a specific card
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            /* Print out card number and then print out 'friendly' version of 
             * card number
             */
            System.out.println("Card number " + deck[i] + ": " + rank + " of "
                    + suit);
        }
    }
}
