public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 0, 5, 0, 10};
        for(int i : arr){
            System.out.print(i + " ");
        }

        if (arr == null || arr.length <= 1) {
            return;
        }
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.println("");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
}
