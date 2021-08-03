public  class RemoveCharacter {
    public static void main(String[] args) throws Exception {
        String str = "abcdefabcdeabcdaaa";
        System.out.println("Original string:\n" + str);
        char c = 'a';
        System.out.println("\nSecond string:\n" +remove(str, c));
    }

    public static String remove(String s, char c){
        String newStr = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != c)
                newStr += s.charAt(i);
        }
        return newStr;
    }
}



