package array;

//Given an array of integers, find the maximum and minimum elements in the array.

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] array = { 10, 5, 7, 2, 15, 3, 8 };

        int min = findMin(array);
        int max = findMax(array);

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
