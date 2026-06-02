public class Player {

    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;
    public boolean hasAce;


    public Player() {
        cardTotal = 0;
        isBust = false;
        isHit = true;
        name = "Me";
        hand = new Card[2];
        hasAce = false;

    }


    public void printInfo() {
        System.out.println("Hello your card total is " + cardTotal );
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
            if(cardTotal > 21){
                isBust = true;
            }
            if(hasAce == true && isBust == true){
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

    public void stand() {
    }

}

