public class P024_BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1110;

        System.out.println(binary);
        int pow = 0;
        int result = 0;

        while (binary > 0) {
            int digit = binary % 10;
            result += digit * Math.pow(2, pow++);
            binary /= 10;
        }

        System.out.println("RESULT : " + result);
    }
}
