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

        String str = Integer.toString(num);

        for(int i = 0; i < str.length(); i++){
            int digit = (int)str.charAt(i);
            convertBinary(digit);
        }
    }
}
