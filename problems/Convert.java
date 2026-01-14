import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1, ch2;
        System.out.println("Enter a Character: ");
        ch1 = sc.next().charAt(0);

        if (ch1 >= 'A' && ch1 <= 'Z') {
            ch2 = Character.toLowerCase(ch1);
            System.out.println(ch2);
        } else {
            ch2 = Character.toUpperCase(ch1);
            System.out.println(ch2);
        }
    }
}
