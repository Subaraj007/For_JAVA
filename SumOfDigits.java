@SuppressWarnings("all")
public class SumOfDigits {
    public static void main(String[] args) {
        int myNum = 1245679;
        int sumOfDigits = 0;
        while (myNum > 0) {
            int balance = myNum % 10;
            sumOfDigits += balance;
            myNum = myNum / 10;

        }
        System.out.println("Total: " + sumOfDigits);

    }
}
