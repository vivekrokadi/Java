/*

V
I I
V V V
E E E E
K K K K K

*/

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");

        String str = sc.nextLine();

        for (int i = 0; i<str.length() ; i++) {
            for(int j=0; j<=i; j++){
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println("");
        }
    }
}
