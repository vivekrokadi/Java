public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {10, 40, 21, 58, 25};
        int sum = 0;

        for(int i=0; i<=arr.length-1; i++){
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }    
}
