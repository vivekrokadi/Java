import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rem, count=0;
        System.out.println("Enter a Number: ");
        n = sc.nextInt();
        while (n>0) {
            rem = n%10;
            count++;
            n = n/10;
        }
 
        System.out.println("No. Of Digits: "+count);
    }
}
