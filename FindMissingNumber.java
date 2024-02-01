
public class FindMissingNumber {
    public static void main(String[] args) {
        // Should not have duplicate
        // Array no need to have sorted order
        // Values should be in range
        // normally 1,2,3,4,5,6,7,8,9
        int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12 };

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a1.length - 1; i++) {
            sum1 = sum1 + a1[i];

        }
        System.out.println("sum1 " + sum1);
        for (int i = 1; i <= a1.length; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("sum2 " + sum2);

        // int missingNum sum2 mins sum1
        System.out.println("Missing nmber is " + (sum2 - sum1));
    }
}
