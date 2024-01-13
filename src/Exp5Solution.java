import java.util.Scanner;

public class Exp5Solution {

    public static void main(String[] args) {
        /*
         * Constructors are used to initalize object.
         */
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        /*
         * Methods are used to perform various operations.
         */
        System.out.print("Enter Student following details:\nName: ");
        String name = sc.nextLine();
        st.setName(name);
        System.out.print("Roll Numer: ");
        int roll = sc.nextInt();
        st.setRollNumber(roll);
        System.out.println("Student record saved successfully.");
        System.out.println("Name: " + st.getName());
        System.out.println("Roll Number: " + st.getRollNumber());
    }
}

class Student {
    private String name;
    private int rollNumber;

    //Constructors
    Student() {
        this("", 0);
    }
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Methods
    public void setName(String newName) {
        name = newName;
    }
    public void setRollNumber(int newRoll) {
        rollNumber = newRoll < 0 ? 0 : newRoll;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
}