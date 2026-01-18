public class Ascending {
    public static void main(String[] args) {
        int arr[] = {10, 21, 87, 44, 12, 18};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(" ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
