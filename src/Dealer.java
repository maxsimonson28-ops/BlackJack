public class Dealer {

    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;




    public Dealer(){
        isOver15 = false;
        cardTotal = 0;
        isBust = false;
        hand = new Card[2];
    }

    public void printInfo(){
        System.out.println("The dealer's card value is  " + cardTotal );
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

    public void hit(){

    }

    public void stand(){

    }
}
