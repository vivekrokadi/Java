import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = obj.next().charAt(0);
        int asci = ch;
        System.out.println(asci);
        
    }
}
