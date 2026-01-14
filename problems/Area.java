import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int r = sc.nextInt(); 
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area  );

        System.out.println("Enter Length and Breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Reactangle: "+ (l*b));

        System.out.println("Enter a side: ");
        int a = sc.nextInt();
        System.out.println("Area of Square: "+ (a*a));

    }
}
