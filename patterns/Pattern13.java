/*

H
H E
H E L
H E L L
H E L L O

*/

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");

        String str = sc.nextLine();

        for(int i=0; i<=str.length(); i++){
            for(int j=0; j<i; j++){
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println("");
        }
    }
}
