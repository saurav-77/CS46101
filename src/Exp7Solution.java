import java.util.Scanner;

public class Exp7Solution {
    public static float calculator(int n1, int n2, String code) {
        switch (code) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                float sn = n2;
                return n1 / sn;
        }
        return 0;
    }

    public static int calculator(float n1, float n2, String code) {
        switch (code) {
            case "+":
                return (int) (n1 + n2);
            case "-":
                return (int) (n1 - n2);
            case "*":
                return (int) (n1 * n2);
            case "/":
                return (int) (n1 / n2);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = sc.nextInt();
        System.out.print("Enter first floating point number: ");
        float f1 = sc.nextFloat();
        System.out.print("Enter second floating point number: ");
        float f2 = sc.nextFloat();
        System.out.println("\nInteger Arithmetic result: (as float)");
        String op = "+-*/";
        for (int i = 0; i < op.length(); ++i) {
            String code = String.valueOf(op.charAt(i));
            System.out.println(n1 + " " + code + " " + n2 + " = " + calculator(n1, n2, code));
        }
        System.out.println("\nFloating point Arithmetic result (rounded down to nearest integer):");
        for (int i = 0; i < op.length(); ++i) {
            String code = String.valueOf(op.charAt(i));
            System.out.println(f1 + " " + code + " " + f2 + " = " + calculator(f1, f2, code));
        }
    }
}
