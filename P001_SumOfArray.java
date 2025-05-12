public class P001_SumOfArray {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 8, 5, 22};
        int add = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                add += numbers[i];
            }
        }

        System.out.println(add);
    }
}