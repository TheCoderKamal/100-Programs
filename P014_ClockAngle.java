import java.util.Scanner;

public class P014_ClockAngle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter hr (1 to 12) : ");
        int hr = sc.nextInt();

        System.out.print("Enter min (0 to 59) : ");
        int min = sc.nextInt();

        double hrAngle = hr * 30;
        double minAngle = min * 5.5;

        double angle = Math.min(360 - Math.abs(hrAngle - minAngle), Math.abs(hrAngle - minAngle));

        System.out.println(angle);
    }
}