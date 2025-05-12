public class P017_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}
