public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {6, 17, 9, 84, 34, 56, 28, 48};

        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);
    }
    
}
