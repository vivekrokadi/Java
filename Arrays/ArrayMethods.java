import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        String arr1[] = {"Java", "Python", "Javascript", "Node", "mySQL"};

        System.out.println("asList() : " + Arrays.asList(arr1));

        System.out.println("toString() : " + Arrays.toString(arr1));

        int arr2[][] = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};

        System.out.println("deepToString() : " + Arrays.deepToString(arr2));
    }
}
