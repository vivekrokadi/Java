import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {3, 4, 6, 8, 9, 13};

        for (int i : arr) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("  ");
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        
    }
}
