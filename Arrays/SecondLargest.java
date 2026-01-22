public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10, 45, 65, 54, 8, 20};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + secondMax);
    }
}
