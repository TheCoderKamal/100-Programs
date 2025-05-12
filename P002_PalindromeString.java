public class P002_PalindromeString {

    public static void main(String[] args) {
        String str = "i am a good boy";
        String palString = "";

        for(int i = str.length() - 1; i >= 0; i--){
            palString += str.charAt(i);
        }

        if(str.equals(palString)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}