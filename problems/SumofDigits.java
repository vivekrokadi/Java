import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digit, sum=0;
        System.out.println("Enter a Number: ");
        n = sc.nextInt();

        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("Sum of Digits: "+ sum);
    }
}
