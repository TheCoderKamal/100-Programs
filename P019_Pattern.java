public class P019_Pattern {

    public static void pattern1(int row){
        int num = 1;
        char ch = 'A';

        for(int i = 0; i < row; i++){
            for(int j = row - i - 1; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                if(i % 2 == 0){
                    System.out.print(num + " ");
                    num++;
                }
                else{
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }

    public static void pattern2(int row){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < ((row - i) * 2) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int row){
        for(int i = 0; i < row; i++){
            if(i == 0){
                for(int j = 0; j < ((row - i) * 2) - 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j = 0; j < row - i; j++){
                    System.out.print("*");
                }
                for(int s = 0; s < (i * 2) - 1; s++){
                    System.out.print(" ");
                }
                for(int j = 0; j < row - i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(5);
    }
}