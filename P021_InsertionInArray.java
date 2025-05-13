import java.util.Scanner;

public class P021_InsertionInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Sise of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before array : ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.print("Enter element you wanna insert : ");
        int element = sc.nextInt();

        System.out.print("Specify the index : ");
        int index = sc.nextInt();

        if(index > size || index < 0){
            System.out.println("Invalid index...");
            return;
        }
        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }

        arr[index] = element;

        System.out.println("After array : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}