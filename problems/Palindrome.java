import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, original, digit, reverse = 0;
        System.out.println("Enter a Number: ");
        num = sc.nextInt();
        original = num;

        while (num > 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome No.");
        } else {
            System.out.println("Not a Palindrome No.");
        }
    }
}
