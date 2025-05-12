public class P7_Fibonacci {
    // Iterative method :

    // public static void main(String[] args) {
    //     int limit = 10;
    //     int first = 0;
    //     int second = 1;
    //     System.out.println(first);
    //     System.out.println(second);

    //     for(int i = 1; i <= limit - 2; i++){
    //         int sum = first + second;
    //         first = second;
    //         second = sum;
    //         System.out.println(sum);
    //     }
    // }


    // Recursive method :
    
    public static void fib(int l, int first, int second){

        if(l == 0){
            return;
        }

        System.out.println(first + second);

        fib(l - 1, second, first + second);
    }
    public static void main(String[] args) {
        int limit = 10;
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);
        fib(limit - 2, first, second);
    }
}
