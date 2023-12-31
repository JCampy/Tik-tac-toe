/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TikTacToe;

/**
 *
 * @author JCampy
 */
public class Player {
    
    // X or Y for player
    private int playerNum;
    private char playerID;
    
    // Constructor for player 
    public Player(){
        this.playerNum = 1; // Initialize player number to 1
        this.playerID = 'x'; // Default player is x  
    }
    
    // Getter for player ID 
    public char getPlayerID(){
        return this.playerID;
    }
    
    // Getter for player number
    public int getPlayerNum(){
        return this.playerNum;
    }
    
    // Setter for player ID 
    public void setPlayerID(char id){
        this.playerID = id;
    }
    
    // Setter for player Number
    public void setPlayerNum(int num){
        this.playerNum = num; 
    }
}