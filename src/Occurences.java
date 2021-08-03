import org.w3c.dom.css.DocumentCSS;

public class Occurences {
    public static void main( String[] args ) {
String str = "saurabh";
char character = 'a';
        System.out.println(ocurrences(str,character));

    }
    public static int ocurrences(String s, char c){
        int count =0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c)
                count++;
        }
        return count;
    }
}
