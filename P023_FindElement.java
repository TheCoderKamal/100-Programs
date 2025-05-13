public class P023_FindElement {
    public static int isInArray(int arr[], int m){
        if(arr.length < 1){
            return 0;
        }
        if(arr[0] == m){
            return 1;
        }

        int[] shortArr = new int[arr.length - 1];

        for(int i = 0; i < shortArr.length; i++){
            shortArr[i] = arr[i + 1];
        }

        return isInArray(shortArr, m);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int m = 6;

        System.out.println(isInArray(arr, m));
    }
}
