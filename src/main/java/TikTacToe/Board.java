/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TikTacToe;

/**
 *
 * @author JCampy
 */
public class Board {
    
    // creating board details 
    // for mock tic-tac-toe board
    private static final int board_width = 3; 
    private static final int board_length = 3;
    
    // Create the matrix
    private int[][] tTTBoard = new int[board_width][board_length];
    
    public Board(){
        // Nothing needed for 
        // Constructor
    }
    
    // Initializing the game board 
    // with empty values
    public void makeBoard(){
        
        // Creating the base board using a array matrix
        for (int i=0;i<board_width;i++){
            for (int j=0;j<board_length;j++){
                tTTBoard[i][j] = ' ';
            }
        }  
    } 
    
    // Public method for returing the entire board
    public int[][] getBoard(){
        return this.tTTBoard;
    }
    
    // Public method that returns a specific tile from the 
    // game board
    public int getSpecificTile(int i, int j){
        return this.tTTBoard[i][j];
    }
    
    // Public method that changes a specific value in a tile
    // from the game board
    public void setSpeicifcTile(int i, int j, int value) {
        this.tTTBoard[i][j] = value;
    }
    
    // Printing the game board 
    public void printBoard(){
        System.out.println("----------------");
        for (int i = 0; i < board_width; i++) {
            System.out.print("| ");
            for (int j = 0; j < board_length; j++) {

                System.out.print(tTTBoard[i][j] + " | ");

                }
            System.out.println();
            }
        System.out.println("----------------");
    }
    
        
    
    
}
