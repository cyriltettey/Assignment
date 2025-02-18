public class Main5 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = calculateSum(array);
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }

    private static int calculateSum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }
}
