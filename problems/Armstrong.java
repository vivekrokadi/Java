import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int temp = num;

        if (num < 0) {
            System.out.println("Not an Armstrong Number");
            return;
        }

        while (temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp/10;
        }

        if (original == sum) {
            System.out.println("Armstrong No.");
        } else {
            System.out.println("Not an Armstrong No.");
        }
    }
}
