
/**
 * Stack class for demonstration.
 * 
 * @author Subaraj
 */
package dsa;

@SuppressWarnings("all")
public class Stack {

    int[] s = new int[10];
    int top;

    Stack() {
        top = -1;
    }

    void push(int item) {
        if (top == 9) {
            System.out.println("Stack Full.");

        } else {
            s[++top] = item;

        }
    }

    int pop() {
        if (top >= 0) {
            return s[top--];
        } else {
            System.out.println("Empty stack");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            result.append(s[i]);
            if (i < top) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
