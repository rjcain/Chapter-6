// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;
public class Square
{
    int[][] square;
    int squareSize;
    
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
        square = new int[squareSize][squareSize];
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int totalValue = 0;
        for(int cols = 0; cols < squareSize; cols++) {
            totalValue += square[row][cols];
        }
        return totalValue;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int totalValue = 0;
        for(int rows = 0; rows < squareSize; rows++) {
            totalValue += square[rows][col];
        }
        return totalValue;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int totalValue = 0;
        for(int cols = 0; cols < squareSize; cols++) {
            totalValue += square[cols][cols];
        }
        return totalValue;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int totalValue = 0;
        for(int cols = 0; cols < squareSize; cols++) {
             totalValue += square[squareSize-1-cols][squareSize-1-cols];
        }
        return totalValue;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        int checks = 0;
        for(int x = 0; x < squareSize; x++) {
            for(int y = 0; y < squareSize; y++) {
                 if(sumRow(x) == sumCol(y) && sumOtherDiag() == sumMainDiag()) {
                     checks++;
                 }
                 else {
                     y = squareSize;
                     x = squareSize;
                    }
            }
        }
        if(checks >= squareSize*squareSize) {
            return true;
        }
        else {
            return false;
        }
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
        squareSize = sq.length;
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }
}
