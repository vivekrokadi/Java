public class MinElement {
    public static void main(String[] args) {
        int arr[] = {8, 19, 32, 80, 2, 43};
        int min = arr[0];

        for (int i : arr) {
            if(min > i){
                min = i;
            }
        }

        System.out.println("Minimum Element: " + min);
    }
}
