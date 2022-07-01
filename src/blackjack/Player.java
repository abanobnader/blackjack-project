package blackjack;

public class Player {
  public  String name;
    public int score=0;
     Card[] arr =  new Card[11];
    boolean get_blackjack ;
    boolean already_lost ;
    private int add=0;
    
   public void add(Card card){
    if(add<11){
    arr[add]=card;
    
     score+= card.getValue();
     add++;
   }}
}

