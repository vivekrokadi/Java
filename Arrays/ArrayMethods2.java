import java.util.Arrays;

public class ArrayMethods2 {
    public static void main(String[] args) {
        int arr1[] = {20, 2, 6, 45, 72, 34};
        Arrays.sort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();

        int arr2[] = Arrays.copyOf(arr1, arr1.length);
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println("");

        System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2));
    } 
}
