public class Swap {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // System.out.println("A: "+ a + " " +  "B: " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("A: "+ a + " " +"B: " + b);


        int a = 50;
        int b = 60;
        System.out.println("A: "+ a + " " +  "B: " + b);
        a = a+b;
        b = a - b;
        a= a - b;
        System.out.println("A: "+ a + " " +"B: " + b);


    }
}
