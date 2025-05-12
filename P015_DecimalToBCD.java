import java.util.Scanner;

public class P015_DecimalToBCD {

    public static void convertBinary(int digit){
        int[] bin = new int[4];
        int index = 3;

        if(digit == 0){
            System.out.print("0000");
            return;
        }
        while(index >= 0 && digit > 0){
            bin[index] = digit % 2;
            digit /= 2;
            index--;
        }

        for(int binary : bin){
            System.out.print(binary);
        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a nubmer : ");
        int num = sc.nextInt();

        int reversed = 0;

        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }   

        while (reversed > 0) {
            int digit = reversed % 10;
            convertBinary(digit);
            reversed /= 10;
        }
    }
}
