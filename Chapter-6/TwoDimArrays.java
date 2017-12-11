
public class TwoDimArrays
{
    // instance variables - replace the example below with your own
    private int ArrayRows = 0;
    private int ArrayCols = 0;
    
    public TwoDimArrays(int rows, int cols) {
        int[][] array = new int[rows][cols];
        ArrayRows = rows;
        ArrayCols = cols;
     }

    public double averageArray(int[][] nums) {
        int totalValue = 0;
        int numValues = 0;
        for(int rows = 0; rows < ArrayRows-1; rows++) {
            for(int cols = 0; cols < ArrayCols-1; cols++) {
                nums[rows][cols] += totalValue;
                numValues++;
            }
        }
        return totalValue/(double)numValues;
    }
    
    public int[] sumColumns(int[][] nums) {
        int colSum = 0;
        int[] ColumnSums = new int[ArrayCols];
        for(int rows = 0; rows < ArrayRows-1; rows++) {
            for(int cols = 0; cols < ArrayCols-1; cols++) {
                nums[rows][cols] = colSum;
            }
            ColumnSums[rows] = colSum;
            colSum = 0;
        }
        return ColumnSums;
    }
    
    public int[][] squareArray(int[][] nums) {
        int[][] squareValues = new int[ArrayRows][ArrayCols];
        for(int rows = 0; rows < ArrayRows-1; rows++) {
            for(int cols = 0; cols < ArrayCols-1; cols++) {
                squareValues[rows][cols] = (nums[rows][cols])*(nums[rows][cols]);
            }
        }
        return squareValues;
    }
}
