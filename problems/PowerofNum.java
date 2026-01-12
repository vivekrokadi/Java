import java.util.Scanner;

public class PowerofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p, result=1 ;
        System.out.println("Enter a Number: ");
        n= sc.nextInt();
        System.out.println("Enetr Power: ");
        p = sc.nextInt();

        for(int i=1; i<=p; i++){
            result = result*n;
        }
        System.out.println("Result: " + result);
    }   
}
