package strings;
import java.util.Scanner;
class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int count = str.isEmpty() ? 0 : str.split("\\s+").length;
        System.out.println("Words = " + count);
    }
}
