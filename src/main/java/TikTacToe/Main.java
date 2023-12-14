/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TikTacToe;

/**
 *
 * @author JCampy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Board bs = new Board();
        bs.makeBoard(); 
        
        System.out.println(bs.getSpecificTile(0, 0));
        // bs.setBoard(0,0,10);
        bs.printBoard();
       
        
    }
    
}
