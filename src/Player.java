public class Player {

    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;


    public Player() {
        cardTotal = 0;
        isBust = false;
        isHit = true;
        name = "Me";
        hand = new Card[2];
    }


    public void printInfo() {
        System.out.println("Hello you have " + cardTotal + " total cards");
        for(int x = 0; x < hand.length; x++){
            hand[x].printInfo();
        }
    }

    public void calculateTotal(){
        cardTotal = 0;
        for(int x = 0; x < hand.length; x++){
            cardTotal += hand[x].value;
        }
    }

    public void hit() {

    }

    public void stand() {
    }

}

