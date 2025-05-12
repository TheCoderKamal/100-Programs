public class P003_FactorOfNumber {

    // iterative

    // public static void main(String[] args) {
    //     int number = 36;

    //     for(int i = 1; i <= number; i++){
    //         if(number % i == 0){
    //             System.out.println(i);
    //         }
    //     }
    // }

    // recursive
    public static void factors(int num, int start){
        if(num == start){
            System.out.println(start);
            return;
        }
        if(num % start == 0){
            System.out.println(start);
        }

        factors(num, ++start);
    }
    public static void main(String[] args) {
        factors(30, 1);
    }
}
