import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12, 8, 18, 10, 65, 89, 73};
        System.out.println("Enter Search Element:");
        int k = sc.nextInt();
        boolean found = false;

        for(int i=0; i<=arr.length-1; i++){
            if (arr[i] == k) {
                System.out.println("Element Found at Index : " + i);
                found = true;
            } 
        }

        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}
