package cntrl_stmt;
import java.util.Scanner;
public class Recruitment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GD score: ");
        int gd = sc.nextInt();
        System.out.print("Enter Aptitude score: ");
        int aptitude = sc.nextInt();
        System.out.print("Enter Technical Interview score: ");
        int tech = sc.nextInt();
        System.out.print("Enter HR Interview score: ");
        int hr = sc.nextInt();
        if (gd < 60) {
            System.out.println("Rejected in GD Round.");
        } else if (aptitude < 60) {
            System.out.println("Rejected in Aptitude Round.");
        } else if (tech < 60) {
            System.out.println("Rejected in Technical Interview.");
        } else if (hr < 60) {
            System.out.println("Rejected in HR Interview.");
        } else {
            System.out.println("Congratulations! You are selected.");
        }
        sc.close();
    }
}
