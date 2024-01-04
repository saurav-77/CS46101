import java.util.Scanner;

public class Exp3Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int N = sc.nextInt();
        for (int i = N; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*" + " \n".charAt(j == i ? 1 : 0));
            }
        }
        sc.close();
    }
}
