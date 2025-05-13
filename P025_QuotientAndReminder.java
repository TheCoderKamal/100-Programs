public class P025_QuotientAndReminder {
    public static void main(String[] args) {
        int a = 13;
        int b = 8;
        int min, max;
        int counter = 0;

        if(a > b){
            min = b;
            max = a;
        }else{
            min = a;
            max = b;
        }

        while (max > min) {
            max -= min;
            counter++;
        }

        System.out.println("Quotient : " + counter);
        System.out.println("Reminder : " + max);
    }
}
