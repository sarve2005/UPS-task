package operator;
import java.util.Scanner;
public class Area {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter length and breadth of rectangle: ");
	        double l = sc.nextDouble();
	        double b = sc.nextDouble();
	        System.out.println("Rectangle area = " + (l * b));
	        System.out.print("Enter length of square side: ");
	        double s = sc.nextDouble();
	        System.out.println("Square area = " + (s * s));
	        System.out.print("Enter circle radius: ");
	        double r = sc.nextDouble();
	        System.out.println("Circle area = " + (Math.PI * r * r));

  }
}
