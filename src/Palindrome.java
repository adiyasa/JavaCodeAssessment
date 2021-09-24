public class Palindrome {
    public static boolean isPalindrome(String input){
        /*char[] ch = input.toCharArray();
        int len = ch.length;
        for (int i = 0; i < len/2; i++) {
            if (ch[i] != ch[len - i -1]){
                return false;
            }
        }
        return true;*/
        StringBuilder stringBuilder = new StringBuilder(input);
        return input.equals(stringBuilder.reverse().toString());
    }
}
