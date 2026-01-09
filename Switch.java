import java.util.Scanner;

public class Switch {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        int a,b;
        String op;
        System.out.println("Enter two no: ");
        a = obj.nextInt();
        b = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter operator");
        op = obj.nextLine();
        switch (op) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            
        
            default:
                System.out.println("not a operator");
                break;
        }
    }    
}
