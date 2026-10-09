package scanner;
import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter movie title: ");
        String movie = sc.nextLine();
        System.out.print("Enter seat number: ");
        String seat = sc.next();
        System.out.print("Enter number of tickets: ");
        int count = sc.nextInt();
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();
        double total = count * price;
        System.out.println("\n--- Booking Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Movie: " + movie);
        System.out.println("Seat: " + seat);
        System.out.println("Tickets: " + count);
        System.out.println("Total Amount: " + total);
        sc.close();
    }
}
