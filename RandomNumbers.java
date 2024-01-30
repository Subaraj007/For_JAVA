import java.util.Random;

@SuppressWarnings("all")
public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        /*
         * int myRand = rand.nextInt(100);
         * System.out.println("My random number is " + myRand);
         */
        double myRand = rand.nextDouble(); // rnage 0.0 to 1.0
        System.out.println("my random double is " + myRand);
    }
}