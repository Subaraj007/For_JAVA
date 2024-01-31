@SuppressWarnings("all")
public class SumOfArray {
    public static void main(String[] args) {
        int myArray[] = { 2, 5, 6, 8, 9, 6 };
        int sumOfMyArray = 0;
        for (int i : myArray) {
            sumOfMyArray = sumOfMyArray + i;

        }
        System.out.println("Sum of my array is: " + sumOfMyArray);
    }
}
