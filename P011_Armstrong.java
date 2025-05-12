import java.util.ArrayList;

public class P011_Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int number = n;
        int sum = 0;
        ArrayList<Integer> l = new ArrayList<Integer>(); 

        while(number > 0){
            l.add(number % 10);
            number /= 10;
        }

        double power = l.size();

        for(int i = 0; i < power; i++){
            sum += Math.pow(l.get(i), power);
        }

        if(n == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }    
}
