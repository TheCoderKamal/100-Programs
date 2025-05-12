public class P4_Factorial {
    
    // Iterative method :
    
    // public static void main(String[] args) {
    //     int num = 6;
    //     int fact = 1;

    //     for(int i = num; i >= 1; i--){
    //         fact *= i;
    //     }

    //     System.out.println(fact);
    // }    


    // Recursive method :
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
