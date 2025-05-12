public class P009_OddEven {
    public static void main(String[] args) {
        int n = 70;

        int ans = n & 1;

        if(ans == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
