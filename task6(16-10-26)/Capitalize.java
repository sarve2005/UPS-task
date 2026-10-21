package strings;
import java.util.Scanner;
class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (!str.isEmpty())
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(str);
    }
}
