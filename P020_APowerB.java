public class P020_APowerB {

    public static int multiply(int a, int b){

        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += a;
        }

        return sum;
    }

    public static int power(int base, int pow){
        if(pow == 0) return 1;

        int result = base;
        for(int i = 1; i < pow; i++){
            result = multiply(result, base);
        }
        return result;
    }
    public static void main(String[] args) {
        int base = 4;
        int pow = 3;
        
        int result = power(base, pow);
        System.out.println(result);
    }
}
