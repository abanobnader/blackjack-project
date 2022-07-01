package blackjack;
import java . util.Scanner;
public class Blackjack {

   static Game g1 = new Game();
   
    public static void main(String[] args) {
        GUI gui = new GUI();
        g1.generates();
        g1.set_information();
        gui.runGUI( g1.cards, 
                    g1.players[0].arr,g1.players[1].arr,
                    g1.players[2].arr,g1.players[3].arr );
                
                  start_player(gui);
                 g1.max_score();
                 start_dealar(gui);
                 g1.max_score();
                 check();
     }
    
    public static void start_player(GUI gui) {
        
        Scanner input = new Scanner(System.in);
        
        String a;
    
        for (int i =0; i<=2;i++){
            for (int l =0; i<=11;l++){
            
                System.out.println("press 1 for hit or 2 for stand : " +i);
                a= input.next() ;
                Card add_Card =g1.drow();
                if( g1.players[i].score>=21){break;}
                if(a.equals("1")){
                    g1.players[i].add(add_Card);
                    gui.updatePlayerHand(add_Card,i );
               
             }
                else if (a.equals("2"))
                break;
                
            }
        }

           
        }
    
    public static void start_dealar(GUI gui){
        
        int h=0;
        for(int i=0;i<4;i++){
            if(g1.highscore[i]>h)

            h=g1.highscore[i];
    
            if(g1.highscore[i]>=g1.players[3].score)  {
             while(g1.players[3].score<h){
                Card add_Card =g1.drow(); 
                g1.players[3].add(add_Card) ;
                gui.updateDealerHand(add_Card,g1.cards);
             }
            
         
    }}
          

}
          
    public static void check() {
        int high=0;
        int score1=0,score2=0,score3=0, score4=0;
        
        int winner = -1;
        for(int i=0;i<4;i++){
            if(g1.highscore[i]>high){
                high=g1.highscore[i];
                winner=i;
            }
            score1=g1.highscore[0];score2=g1.highscore[1];
            score3=g1.highscore[2]; score4=g1.highscore[3];
        }
         if(winner>=0){
            System.out.println("winner is "+g1.players[winner].name+" score "+ high);
            }  
            else if(score1 == score2){
                System.out.println(g1.players[0].name+" push "+g1.players[1].name);
            }else if(score1 == score3){
                System.out.println(g1.players[0].name+" push "+g1.players[2].name);
            }else if(score1 == score4){
                System.out.println(g1.players[0].name+" push "+g1.players[3].name);
            }else if(score2 == score3){
                System.out.println(g1.players[1].name+" push "+g1.players[2].name);
            }else if(score2 == score4){
                System.out.println(g1.players[1].name+" push "+g1.players[3].name);
            }else if(score3 == score4){
                System.out.println(g1.players[2].name+" push "+g1.players[3].name);
            }
    }
   







}




