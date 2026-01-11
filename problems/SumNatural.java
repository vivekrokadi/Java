import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n = obj.nextInt();
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
