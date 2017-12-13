
public class TwoDimArrays
{
    // instance variables - replace the example below with your own
    private int ArrayRows = 0;
    private int ArrayCols = 0;
    
    public TwoDimArrays() {
    
    }

    public double averageArray(int[][] nums) {
        int sum = 0;
        int numValues = 0;
        for(int rows = 0; rows < nums.length; rows++) {
            for(int cols = 0; cols < nums[0].length; cols++) {
                sum += nums[rows][cols];
                numValues++;
            }
        }
        return (double)sum/numValues;
    }
    
    public int[] sumColumns(int[][] nums) {
        int colSum = 0;
        int[] ColumnSums = new int[nums[0].length];
        for(int cols = 0; cols < nums[0].length; cols++) {
            for(int rows = 0; rows < nums.length; rows++) {
                colSum += nums[rows][cols];
            }
            ColumnSums[cols] = colSum;
            colSum = 0;
        }
        return ColumnSums;
    }
    
    public int[][] squareArray(int[][] nums) {
        int[][] squareValues = new int[nums.length][nums[0].length];
        for(int rows = 0; rows < nums.length; rows++) {
            for(int cols = 0; cols < nums[0].length; cols++) {
                squareValues[rows][cols] = (nums[rows][cols])*(nums[rows][cols]);
            }
        }
        return squareValues;
    }
}
