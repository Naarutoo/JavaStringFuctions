public class Palindrome {
    public static void main( String[] args ) {
        String s = "saurabh";
ispalindrome(s);    
    }

    public static void ispalindrome(String str){
        String reverse ="";
        for (int i = str.length()-1; i>=0;i--){
            reverse += reverse+str.charAt(i);
        }
        if (str.equals(reverse))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palidrome");

    }
}
