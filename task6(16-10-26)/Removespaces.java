package strings;
import java.util.Scanner;
class Removespaces {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        str = str.replaceAll("\\s+", "");
        System.out.println(str);
    }
}
