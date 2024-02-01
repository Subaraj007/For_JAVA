import java.util.HashSet;

/**
 * @author Subaraj
 */
public class HashSetMethodDuplicate {
    public static void main(String[] args) {
        String[] a1 = { "Java", "Python", "Java", "Html", "Css" };
        HashSet<String> duplicateString = new HashSet<>();
        for (String i : a1) {
            if (!duplicateString.add(i)) {
                System.out.println("Duplicate is " + i);
            }
        }

    }
}
