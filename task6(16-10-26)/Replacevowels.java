package strings;
import java.util.Scanner;
class Replacevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("(?i)[aeiou]", "*");
        System.out.println(str);
    }
}
