public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {{2, 8}, {3, 6}};
        int B[][] = {{9, 3}, {5, 7}};

        int C[][] = new int[A.length][B[0].length];

        System.out.println("A: ");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("B: ");
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B[0].length; j++){
                for(int k=0; k<A[0].length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("A * B: ");
        for(int i=0; i<C.length; i++){
            for(int j=0; j<C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }   
    }
}
