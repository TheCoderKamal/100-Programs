import java.util.Scanner;

public class P022_DeletionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before the Array : ");
        for(int e : arr){
            System.out.print(e + " ");
        }

        System.out.print("Enter an element you wanna delete : ");
        int ele = sc.nextInt();

        int idx = 0;
        boolean isIndex = false;
        for(int i = 0; i < size; i++){
            if(arr[i] == ele){
                idx = i;
                isIndex = true;
                break;
            }
        }

        if(!isIndex){
            System.out.println("Element is not found..");
            return;
        }

        for(int i = idx; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("After delete : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
