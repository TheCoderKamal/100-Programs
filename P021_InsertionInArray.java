import java.util.Scanner;

public class P021_InsertionInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int[] arr = new int[100];

        System.out.print("Sise of an array : ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before array : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("Enter element you wanna insert : ");
        int element = sc.nextInt();

        System.out.print("Specify the index : ");
        int index = sc.nextInt();

        if(index > size || index < 0){
            System.out.println("Invalid index...");
        }
        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }

        arr[index] = element;
        size++;

        System.out.println("After array : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}