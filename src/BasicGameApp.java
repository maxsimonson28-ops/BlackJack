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
        me.printInfo();
        d.printInfo();


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

    }

    public void round(){

    }





}
