import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digit, reverse = 0;
        System.out.println("Enter a Number: ");
        n = sc.nextInt();

        while (n>0) {
            digit = n%10;
            reverse = (reverse * 10) + digit;
            n = n/10;
        }

        System.out.println(reverse);
    }
}