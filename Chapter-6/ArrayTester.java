

public class ArrayTester
{
    public static void main(String args[]) {
        TwoDimArrays test = new TwoDimArrays();
        int[][] arr1 = {{4, 7, 3,},
                        {9, 2, 3,}};
        System.out.println(test.averageArray(arr1));
        for(int x = 0; x < test.sumColumns(arr1).length; x++) {
            System.out.print(test.sumColumns(arr1)[x] + " ");
        }
        System.out.println();
        for(int x = 0; x < test.squareArray(arr1).length; x++) {
            for(int y = 0; y < test.squareArray(arr1)[0].length; y++) {
                System.out.print(test.squareArray(arr1)[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
