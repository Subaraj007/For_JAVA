@SuppressWarnings("all")
public class CountEvenOddDigits {
    public static void main(String[] args) {
        int myNum = 12345678;
        int even = 0;
        int odd = 0;
        while (myNum > 0) {
            int division = myNum % 10;
            myNum = myNum / 10;

            if (division % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }
        System.out.println("Even count: " + even + " ,Odd count: " + odd);
    }
}
