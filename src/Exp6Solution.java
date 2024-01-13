import java.util.Scanner;

public class Exp6Solution {

    public static void main(String[] args) {

    }
}

class Patient {
    private String name;
    private int age;
    private String bloodGroup;
    private String treatmentType;

    Patient() {
        this.patientDetails();
    }

    public void patientDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient Following details:\nName: ");
        name = sc.next();
        System.out.println("Age: ");

        System.out.println("Do patient needs blood (type yes|no): ");
        if (sc.next().equals("yes")) {
            this.bloodNeed();
        }
    }

    public void bloodNeed() {
        System.out.println("Choose blood group (A | B | AB | O)");
        bloodGroup = new Scanner(System.in).next().toUpperCase();
    }
    public double getbloodCost() {
        if (bloodGroup == null) {
            return 0;
        }
        switch(bloodGroup) {
            case "A": return 1600;
            case "B": return 1200;
            case "AB": return 1000;
            case "O": return 800;
        }
        return 0;
    }
    public double getTreatmentCost() {
        
    }
    public void showBill() {

    }
}