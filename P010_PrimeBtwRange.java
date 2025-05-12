public class P010_PrimeBtwRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 47;
        boolean isPrime = false;

        for(int i = start; i <= end; i++){
            if(i % 2 == 0 && i != 2){
                continue;
            }
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }else{
                    isPrime = true;
                }
            }

            if(isPrime == true){
                System.out.println(i);
            }
        }
    }
}
