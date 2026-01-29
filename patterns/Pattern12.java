/*

A
A B
A B C
A B C D
A B C D E
A B C D E F

*/

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Charatcer: ");
        char ch = Character.toUpperCase(sc.next().charAt(0));

        for(char i='A'; i<=ch; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
