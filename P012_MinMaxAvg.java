import java.util.Scanner;

public class P012_MinMaxAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();

            if(num > max){
                max = num;
            } 
            if(num < min){
                min = num;
            }
            sum += num;
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + sum/n);
    }
}
