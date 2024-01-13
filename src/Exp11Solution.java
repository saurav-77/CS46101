import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exp11Solution {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("machine.txt");
        for (int i = 1; i <= 3; ++i) {
            System.out.println("Enter details of Laptop-" + i + ":");
            Laptop lp = new Laptop();
            pw.println("Laptop-" + i + " details are: ");
            lp.takeDetails();
            pw.println(lp + "\n"); System.out.println();
        }
        pw.close();
        String message = "All laptop details saved successfully in newly generated file named machine.txt located in current folder.";
        System.out.println(message);
    }
}

class Laptop {
    private String companyName;
    private int RAM;
    private String processorName;
    private int SSD;

    public void takeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Laptop Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Processor Name: ");
        processorName = sc.nextLine();
        System.out.print("Amount of RAM (in GB): ");
        RAM = sc.nextInt();
        System.out.print("SSD Capacity (in GB): ");
        SSD = sc.nextInt();
    }

    public String toString() {
        return "Company: " + companyName + "\n" + "Processor: " + processorName + "\n" + "RAM: " + RAM + "GB\n" + "SSD: " + SSD + "GB";
    }
}