package strings;
import java.util.Scanner;
class Replacevowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        str = str.replaceAll("(?i)[aeiou]", "*");
        System.out.println(str);
    }
}
