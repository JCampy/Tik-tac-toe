 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TikTacToe;
import java.util.*;
/**
 *
 * @author JCampy
 */
public class GameLogic {
    
    private String keepPlaying;
    private int score = 0;
    
    Scanner sc = new Scanner(System.in);
    Board gb = new Board();
    
    public GameLogic(){
        
    }
     
    /*
    public Player numOfPlayers(){
        Player p = new Player();
        Player p2 = new Player();
        int response; 
        System.out.println("How many players will there be?");
        response = sc.nextInt();
        if (response == 2){
            String input1;
            System.out.println("Player 1: Do you want X or O");
            
            
        }
    }
    */
    public void isGameOver(char[][] arr){
        int totalTiles = gb.getBoard_width()*gb.getBoard_Length();
        int counter = 0;
        for (int i=0;i<gb.getBoard_width();i++){
            for (int j=0;j<gb.getBoard_Length();j++){
                if(arr[i][j] == 'O' || arr[i][j] == 'X'){
                    counter++;
                }
            }
        }
        if (counter == totalTiles){
            System.out.println("Game over, it's a tie!");
            this.score =  score + 0;
            
            while(true){
                System.out.println("Do you want to keep playing? Enter: Y/N");
                this.keepPlaying = sc.next().toUpperCase();
            
                if(this.keepPlaying.equals("Y")){
                //Its yes, restart the game
                break;
                }
                else if(this.keepPlaying.equals("N")){
                //It's no, exit the program
                System.exit(0);
                break;
                }
                else{
                    System.out.println("Incorrect input please type a Y or N");
                    this.keepPlaying = sc.next().toUpperCase();
                }
            }
            
             
        }
    }
    
    public boolean isLegal(char[][] arr, int i, int j){
        if (arr[i][j] == ' '){
           return true; 
        }
        else{
            return false;
        }
        
    }
    public boolean gameWon(char[][] arr){
        int countX = 0;
        int countO = 0;
        String won;
        
        // Checking horizontal
        for(int i=0; i<gb.getBoard_width(); i++){
            for (int j=0; j<gb.getBoard_width(); j++){
                if(arr[i][j] == 'X'){
                    countX++;
                }
                else if(arr[i][j] == 'O'){
                    countO++;
                }
            }
            
            if(countX == 3){
            won = "Y";
            }
            
        }
        
        
        // Checking Vertical
        for(int i=0; i<gb.getBoard_width(); i++){
            for (int j=0; j<gb.getBoard_width(); j++){
                if(arr[j][i] == 'X'){
                    countX++;
                }
                else if(arr[j][i] == 'O'){
                    countO++;
                }
            }
        }
        
       
    }
    
    public int convertInput(int i){
        // use case switch here
    }
}
