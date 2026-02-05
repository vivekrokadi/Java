public class FreqofElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 6, 4};
        
        
        for(int i=0; i<arr.length; i++){
            boolean counted = false;
            for(int k=0; k<i; k++){
                if (arr[k] == arr[i]) {
                    counted = true;
                    break;
                }
            }
            
            if (counted) {
                continue;
            }
            
            int freq = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    freq++;
                }
            }

            System.out.println(arr[i] + " = " + freq);
        }
    }
}
