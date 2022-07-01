package blackjack;
import java .util .Random;
import java .util .Scanner;

public class Game {
  Player[] players=new Player[4] ;
  Card[] cards=new Card [52];
   int[] highscore=new int[4];   

  
    public void generates(){
        int i;
      for(i =0;i<4;i++){
         int w;
        for(int l =0;l<13;l++){
          if(l<10){
             w=l+1;
             cards[i*13+l] =new Card(i, l, w) ;
            }
            else{
            w=10;
            cards[i*13+l] =new Card(i, l, w) ;
            }
        }

      }
    }
    public  Card drow(){
      Random rand = new Random();
       Card  drowcard =null;
      do{
        int randem1 =rand.nextInt(52);
         drowcard = cards[randem1];
        
        cards[randem1] =null;
        
       }while( drowcard == null);
      
       return drowcard;
    }
    
   
    
    Scanner input = new Scanner(System.in);
      public void set_information(){
        for(int i =0;i<=3;i++){
           if(i==0 || i==1 || i==2){
          System.out.println("Enter name of player " + (i+1) + " : ");
          players[i]=new Player();
          players[i].name =input.next();
          players[i].add(drow()) ;
          players[i].add(drow());
          
         }
        else 
        if(i==3){
        players[i]=new Player();
        players[i].name ="dealar";
        System.out.println(" name of player " + (i+1) + " is dealar");
        players[i].add(drow()) ;
        players[i].add(drow()); 
        
        }
          }
      }


public void max_score(){
    for(int i =0;i<4;i++){
      if(players[i].score<=21)

      highscore[i]=players[i].score;
      else
      highscore[i]=0;
      
    }
  }







}
