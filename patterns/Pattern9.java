import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a No.: ");
        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.err.print(count+" ");
            }
            System.err.println("");
        }
    }
}
