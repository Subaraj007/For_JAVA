/**
 * @author Subaraj
 */

public class FindMaxOfArray {
    public static void main(String[] args) {
        int[] a1 = { 20, 30, 20, 40, 60, 60 };
        int max = a1[0];
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] > max) {
                max = a1[i];
            }
        }
        System.out.println("Maximum is " + max);
    }
}

// Another way
/*
 * public class FindMaxOfArray{
 * public static void main(String[] args) {
 * int[] a1 = {20, 30, 80, 40, 10, 60};
 * int max = findMax(a1);
 * System.out.println("Maximum is " + max);
 * }
 * 
 * // Method to find the maximum value in an array
 * public static int findMax(int[] arr) {
 * if (arr.length == 0) {
 * // Handle the case of an empty array
 * System.out.println("The array is empty.");
 * return Integer.MIN_VALUE; // Assuming the minimum integer value as a
 * placeholder
 * }
 * 
 * int max = arr[0]; // Assume the first element as the maximum
 * 
 * // Iterate through the array to find the maximum value
 * for (int i = 1; i < arr.length; i++) {
 * if (arr[i] > max) {
 * max = arr[i];
 * }
 * }
 * 
 * return max;
 * }
 * }
 */