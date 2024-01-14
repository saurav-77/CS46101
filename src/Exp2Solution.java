import java.util.Scanner;

public class Exp2Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your GRE marks(%): ");
        double greMarks = sc.nextDouble();
        System.out.print("Enter your TOEFL marks(%): ");
        double toeflMarks = sc.nextDouble();
        String uNameFirst = "University Name: Oxford University";
        String uNameSecond = "University Name: MIT";
        String dn = "Department Name: ";
        String cse = "Computer Sc. and Engg.";
        String ec = "Electronics Engg.";
        String che = "Chemical Engg.";
        String ee = "Electrical Engg.";
        String ce = "Civil Engg.";
        String goodNews = "Congratulations! You are alloted a seat in following university and department";
        String sadNews = "Sorry! No seat alloted.";
        if (greMarks > 70) {
            if (toeflMarks >= 70) {
                System.out.println(goodNews + "\n" + uNameFirst + "\n" + dn + cse);
            } else if (toeflMarks >= 60) {
                System.out.println(goodNews + "\n" + uNameFirst + "\n" + dn + ec);
            } else if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameFirst + "\n" + dn + ee);
            } else {
                System.out.println(sadNews);
            }
        } else if (greMarks >= 60) {
            if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameSecond + "\n" + dn + cse);
            } else {
                System.out.println(sadNews);
            }
        } else if (greMarks > 50) {
            if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameSecond + "\n" + dn + che);
            } else {
                System.out.println(sadNews);
            }
        } else if (greMarks >= 50) {
            if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameSecond + "\n" + dn + ce);
            } else {
                System.out.println(sadNews);
            }
        } else {
            System.out.println(sadNews);
        }
        sc.close();
    }
}