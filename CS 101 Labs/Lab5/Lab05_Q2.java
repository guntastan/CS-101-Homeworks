/**
 * Lab05_Q2
 */
import java.util.Random;
import java.util.Scanner;

public class Lab05_Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String deck = "";
        for(int i = 1; i <= 9; i++){
            for (int j = 4 ; j > 0; j--){
                deck = deck + i;
            }
        }
        String playersCard = "";
        String dealersCard = "";
        String deckAfterPinitial = "";
        String deckAfterDinitial = "";
        int lengthDeckFirst = deck.length();
        for (int twoPlayercard = 2; twoPlayercard >=1; twoPlayercard--){
            int randomPickP = rand.nextInt(lengthDeckFirst);
            playersCard = playersCard + deck.charAt(randomPickP);
            deckAfterPinitial = deck.substring(0,randomPickP) + deck.substring(randomPickP+1);
            deck = deckAfterPinitial;
            lengthDeckFirst--;
        }
        for (int twoDealercard = 2; twoDealercard >=1; twoDealercard--){
            int randomPickD = rand.nextInt(lengthDeckFirst);
            dealersCard = dealersCard + deck.charAt(randomPickD);
            deckAfterDinitial = deck.substring(0,randomPickD) + deck.substring(randomPickD+1);
            deck = deckAfterDinitial;
            lengthDeckFirst--;
        }
        String dealersHiddenPrint = dealersCard.charAt(0) +  "?";
        System.out.println("Dealer is now dealing cards...");
        System.out.println("Player's hand: \n" + playersCard);
        System.out.println("Dealer's hand: \n" + dealersHiddenPrint);
        
        int sumPlayer = 0;
        for (int s1 = 1 ; s1 >= 0; s1--){
            sumPlayer = sumPlayer + Character.getNumericValue(playersCard.charAt(s1));
        }       
        int sumDealer = 0;
        for (int s2 = 1 ; s2 >= 0; s2--){
            sumDealer = sumDealer + Character.getNumericValue(dealersCard.charAt(s2));
        }      
        int summax = 0;
        if (sumPlayer > sumDealer){
            summax = sumPlayer;
        }
        else if(sumDealer > sumPlayer){
            summax = sumDealer;
        }
        else{
            summax = sumDealer;
            summax = sumPlayer;
        }
        int index = 2;        
        int a = summax;
        int checkmark= 0;
        
        for (int sum21 = 21 ; sum21>0 ; sum21 = sum21-a){
            System.out.println("Please enter your choice:");
            System.out.println("1) Hit");
            System.out.println("2) Stand");
            String choiceUser = scan.nextLine();

            if (choiceUser.equals("1")){
                System.out.println("Hit! Dealer is giving the player a card...");
                int randomPickP1 = rand.nextInt(lengthDeckFirst);
                playersCard = playersCard + deck.charAt(randomPickP1);
                deckAfterPinitial = deck.substring(0,randomPickP1) + deck.substring(randomPickP1+1);
                deck = deckAfterPinitial;
                lengthDeckFirst--;
                sumPlayer = sumPlayer + Character.getNumericValue(playersCard.charAt(index));
                
                System.out.println("Player's hand: " + playersCard);
                if (sumPlayer == 21){
                    System.out.println("Player scored 21. Player wins!");
                    checkmark = 1;
                    a = 1000;
                }
                else if (sumPlayer >21){
                    System.out.println("Player scored over 21. Player lost!");
                    checkmark = 1;
                    a = 1000;
                }
                a = Character.getNumericValue(playersCard.charAt(index));
                index++; 
            }
            else if (choiceUser.equals("2")){                
                System.out.println("Stand! Player's turn is now over. Player's hand sums to " + sumPlayer);
                System.out.println();              
                System.out.println("Dealer is drawing cards...");
                a = 1000;                
            }        }
        
        if (checkmark== 0){
            for(int indexD = 2;sumDealer <=21; indexD++){            
                int randomPickD1 = rand.nextInt(lengthDeckFirst);
                dealersCard = dealersCard + deck.charAt(randomPickD1);
                deckAfterPinitial = deck.substring(0,randomPickD1) + deck.substring(randomPickD1+1);
                deck = deckAfterPinitial;
                lengthDeckFirst--;
                sumDealer = sumDealer + Character.getNumericValue(dealersCard.charAt(indexD));
                System.out.println("Dealer's hand:");
                System.out.println(dealersCard);                
                if (sumDealer >21){
                    System.out.println("Dealer scored over 21. Dealer lost!");
                    break;
                }
                else if (sumDealer>sumPlayer && sumDealer < 21){
                    System.out.println("Dealer scored more than player. Dealer wins!");
                    sumDealer = 22;
                }
                else if (sumDealer == 21){
                    System.out.println("Dealer scored 21. Dealer wins!");
                    sumDealer = 22;
                }
            }           
        }
        System.out.println(deck);
        scan.close();
    }
}