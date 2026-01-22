public class CountEO {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 68, 12, 89, 54, 77, 48, 32};
        int even=0, odd=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println("Even Elements: "+ even);
        System.out.println("Odd Elements: "+ odd);
    }
}
