public class Exp9Solution {

    public static void main(String[] args) {
        int x[] = {3, 2, 1, 0};
        try {
            int y = x[0] / x[3];
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " is not allowed!");
            System.out.println("Exception successfully handled.");
        }
    }
}