public class Card {

public String suit;
public int value;
public String name;



public Card(int pValue,String pSuit, int pName){
    suit = pSuit;
    value = pValue;
    if(pName == 0){
        name = "Ace";
        value = 11;
    }
    else if(pName == 1){
        name = "2";
        value = 2;
    }
    else if(pName == 2){
        name = "3";
        value = 3;
    }
    else if(pName == 3){
        name = "4";
        value = 4;
    }
    else if(pName == 4){
        name = "5";
        value = 5;
    }
    else if(pName == 5){
        name = "6";
        value = 6;
    }
    else if(pName == 6){
        name = "7";
        value = 7;
    }
    else if(pName == 7){
        name = "8";
        value = 8;
    }
    else if(pName == 8){
        name = "9";
        value = 9;
    }
    else if(pName == 9){
        name = "10";
        value = 10;
    }
    else if(pName == 10){
        name = "Prince";
        value = 10;
    }
    else if(pName == 11){
        name = "Queen";
        value = 10;
    }
    else if(pName == 12){
        name = "King";
        value = 10;
    }
}

public void printInfo(){
    System.out.println("the " + name + " of " + suit + " is worth " + value + " points");
}


}
