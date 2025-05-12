public class P008_NoOfOddEven {
    public static void main(String[] args) {
        int number = 23487658;
        int odd = 0;
        int even = 0;

        while (number > 0) {
            int digit = number % 10;
            if(digit % 2 == 0){
                even++;
            }else{
                odd++;
            }
            number /= 10;
        }

        System.out.println(odd);
        System.out.println(even);
    }
}
