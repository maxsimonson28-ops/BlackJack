public class Dealer {

    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public boolean hasAce;




    public Dealer(){
        isOver15 = false;
        cardTotal = 0;
        isBust = false;
        isHit = true;
        hand = new Card[2];
        hasAce = false;
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
            if(hand[x].name.equals("Ace")){
                hasAce = true;
            }
            if(isBust == true && hasAce == true){
                cardTotal = cardTotal - 10;
            }
        }
    }

    public void hit() {
        cardTotal = 0;
        if(isHit == true){
            for(int x = 0; x < hand.length; x++){
                cardTotal += hand[x].value;
            }

        }

    }

    public void stand(){

    }
}
