public class P018_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11, 0, 5, 10, -2};

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}
