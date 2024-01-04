import java.util.Scanner;

public class Exp2Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your GRE marks(%): ");
        double greMarks = sc.nextDouble();
        System.out.print("Enter your TOEFL marks(%): ");
        double toeflMarks = sc.nextDouble();
        final String goodNews = "Congratulations! You are alloted a seat in following university and department";
        final String sadNews = "Sorry! No seat alloted.";
        final String uNameFirst = "University Name: Oxford University";
        final String uNameSecond = "University Name: MIT"; final String dn = "Department Name: ";
        final String cse = dn + "Computer Sc. and Engg.";
        final String ec = dn + "Electronics Engg."; final String che = dn + "Chemical Engg.";
        final String ee = dn + "Electrical Engg."; final String ce = dn + "Civil Engg.";
        if (greMarks > 70) {
            if (toeflMarks >= 70) {
                System.out.println(goodNews + "\n" + uNameFirst + "\n" + cse);
            } else if (toeflMarks >= 60) {
                System.out.println(goodNews + "\n" + uNameFirst + "\n" + ec);
            } else if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameFirst + "\n" + ee);
            } else  {
                System.out.println(sadNews);
            }
        } else if (greMarks >= 60) {
            if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameSecond + "\n" + cse);
            } else {
                System.out.println(sadNews);
            }
        } else if (greMarks > 50) {
            if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameSecond + "\n" + che);
            } else {
                System.out.println(sadNews);
            }
        } else if (greMarks >= 50) {
            if (toeflMarks >= 50) {
                System.out.println(goodNews + "\n" + uNameSecond + "\n" + ce);
            } else {
                System.out.println(sadNews);
            }
        } else {
            System.out.println(sadNews);
        }
        sc.close();
    }
}