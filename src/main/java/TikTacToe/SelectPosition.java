/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TikTacToe;

/**
 *
 * @author Jason
 */
public class SelectPosition {
    private int indexOne;
    private int indexTwo;
    
    public void convertInput(int i){
        int input = i;
        // use case switch here
        switch(input) {
            case 1:
                this.indexOne = 0;
                this.indexTwo = 0;
                break;
            case 2:
                this.indexOne = 0;
                this.indexTwo = 1;
                break;
            case 3:
                this.indexOne = 0;
                this.indexTwo = 2;
                break;
            case 4:
                this.indexOne = 1;
                this.indexTwo = 0;
                break;
            case 5:
                this.indexOne = 1;
                this.indexTwo = 1;
                break;
            case 6:
                this.indexOne = 1;
                this.indexTwo = 2;
                break;
            case 7:
                this.indexOne = 2;
                this.indexTwo = 0;
                break;
            case 8:
                this.indexOne = 2;
                this.indexTwo = 1;
                break;
            case 9:
                this.indexOne = 2;
                this.indexTwo = 2;
                break;
        }
    }
    
    public int getIndexOne(){
        return this.indexOne;
    }
    
    public int getIndexTwo(){
        return this.indexTwo;
    }
    
}
