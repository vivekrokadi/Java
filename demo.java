/*   local variable
public class demo {

    public static void main(String[] args){
        int a = 20;
        demo A = new demo();
        System.out.print(A.a);
    }

}

instance variable
public class demo {

    int a = 20;
    public static void main(String[] args){
        demo A = new demo();
        System.out.print(A.a);
    }

}
*/

public class demo {

    static String name = "vivek"; 
    public static void main(String []args){
        System.out.println(name);
    }
}
