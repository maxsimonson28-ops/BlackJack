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
        name = "me";
        hand = new Card[2];
    }


    public void printInfo() {
        System.out.println("Hello " + name + " you have " + cardTotal + " total cards");
    }

    public void hit() {

    }

    public void stand() {
    }

}

