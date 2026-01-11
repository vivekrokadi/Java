import java.util.Scanner;

public class Sum2No {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 Numbers: ");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Sum: "+ (a + b));
    }
}
