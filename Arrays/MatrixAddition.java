public class MatrixAddition {
    public static void main(String[] args) {
        int A[][] = {{1,4}, {2, 4}};
        int B[][] = {{5,3},{2,7}};

        int rows = A.length;
        int cols = A[0].length;
        int C[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                C[i][j] = A[i][j] + B[i][j]; 
            }
        }
        System.out.println("A: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(A[i][j] + " "); 
            }
            System.out.println("");
        }
        
        
        System.out.println("B: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(B[i][j] + " "); 
            }
            System.out.println("");
        }
        
        System.out.println("C: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(C[i][j] + " "); 
            }
            System.out.println("");
        }
        
    }   
}
