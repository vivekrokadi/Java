public class MatrixTranspose {
    public static void main(String[] args) {
        int A[][] = {{10, 20}, {30, 40}};

        System.out.println("A: ");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("A Transpose: ");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                System.out.print(A[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
