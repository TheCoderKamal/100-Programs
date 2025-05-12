import java.util.Scanner;

public class P013_MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("size of matrix - 1 :");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] m1 = new int[row1][col1];

        System.out.println("size of matrix - 2 : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] m2 = new int[row2][col2];

        if(col1 != row2){
            System.out.println("invalid dimentions...");
            return;
        }

        System.out.println("element of matrix - 1 : ");
        for(int i = 0; i < row1; i++){
            for(int j  = 0; j < col1; j++){
                m1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("element of matrix - 2 : ");
        for(int i = 0; i < row2; i++){
            for(int j  = 0; j < col2; j++){
                m2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int[][] m3 = new int[row1][col2];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                for(int k = 0; k < col1; k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("result : ");

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}