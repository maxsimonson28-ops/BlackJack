public class BasicGameApp {

    public Card[] deck;
    private Player me;
    private Dealer d;

    public static void main(String[] args) {
        new BasicGameApp();
    }

    public BasicGameApp(){
        System.out.println("Welcome to Blackjack");
        deck = new Card[52];
        for(int x = 0; x < 14; x++){
            deck[x] = new Card(10,"hearts",x);
            deck[x].printInfo();
        }
    }

    public void compare(){

    }

    public void round(){

    }

    public void shuffle(){

    }



}
