import java.util.Scanner;

@SuppressWarnings("all")
public class Factorial {
    public static void main(String[] args) {
        Scanner uInp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int uInt = uInp.nextInt();
        int num = 1;
        for (int i = uInt; i > 0; i--) {
            num = num * i;
        }
        System.out.println("Factorial of " + uInt + " is " + num);
    }
}
