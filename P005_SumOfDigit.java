public class P005_SumOfDigit {
    // Iterative method :

    // public static void main(String[] args) {
    //     int n = 12345;
    //     int sum = 0;

    //     while(n > 0){
    //         int digit = n % 10;
    //         sum += digit;
    //         n /= 10;
    //     }

    //     System.out.println(sum);
    // }


    // Recursive method :

    public static int sumOfDigit(int n, int sum){
        if(n <= 0){
            return sum;
        }
        int d = n % 10;
        return sumOfDigit(n/10, sum + d);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(18236523, 0));
    }
}
