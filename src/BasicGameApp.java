import java.util.Scanner;

public class BasicGameApp {

    public Card[] deck;
    private Player me;
    private Dealer d;

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp() {
        System.out.println("Welcome to Blackjack");
        deck = new Card[52];
        int counter = 0;

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 13; x++) {
                deck[counter] = new Card(10, y, x);
                counter++;
               // deck[x].printInfo();
            }
        }
        shuffle();
        printDeck();

        me = new Player();
        d = new Dealer();
       // me.calculateTotal();

        me.hand[0] = deck[0];
        me.hand[1] = deck[1];
        me.calculateTotal();
        d.hand[0] = deck[2];
        d.hand[1] = deck[3];
        d.calculateTotal();



        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.println(name);
        me.name = name;




        me.printInfo();
        d.printInfo();

        System.out.println("Hit or stand");
        String hit = s.nextLine();
        System.out.println(hit);
        if(hit.equals("hit")){
            System.out.println("You chose HIT");
            me.isHit = true;
            me.hand = new Card[3];
            me.hand[0] = deck[0];
            me.hand[1] = deck[1];
            me.hand[2] = deck[4];
            me.hit();
            me.printInfo();
            System.out.println("hit or stand");
        }
        if(hit.equals("stand")){
            me.isHit = false;
            System.out.println("You chose STAND");
            me.printInfo();
        }
        if(me.cardTotal > 21){
            me.isBust = true;
            System.out.println("You BUSTED");
        }

        if (d.cardTotal < 17){
            d.isHit = true;
            System.out.println("The Dealer Hits");
            d.hand = new Card[3];
            d.hand[0] = deck[2];
            d.hand[1] = deck[3];
            d.hand[2] = deck[5];
            d.hit();
            d.printInfo();
        }
        else{
            d.isHit = false;
            d.printInfo();
            System.out.println("The Dealer Stands");

        }
        if(d.cardTotal > 21){
            d.isBust = true;
            System.out.println("The dealer BUSTED");
        }
        compare();




    }


    public void printDeck(){
        for(int i = 0; i < deck.length; i++){
            deck[i].printInfo();
        }
    }

    public void shuffle(){
        for(int x = 0; x < deck.length; x++){
            int randomIndex = (int)(Math.random() * 52);
            Card spencer = deck[randomIndex];
            deck[randomIndex] = deck[x];
            deck[x] = spencer;
        }
    }

    public void compare(){


    if(me.isBust == true){
        System.out.println("The dealer WINS");
    }
    else if(d.isBust == true){
        System.out.println("you WIN");
    } else if (d.cardTotal > me.cardTotal) {
        System.out.println("the dealer WINS");
    } else if (me.cardTotal > d.cardTotal) {
        System.out.println("you WIN");
    }else {
        System.out.println("you PUSH");
    }


    }

    public void round(){

    }





}
