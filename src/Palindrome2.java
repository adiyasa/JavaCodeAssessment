public class Palindrome2 {
    public static boolean isPalindrome(String str)
    {
        char[] ch = str.toCharArray();
        int len = ch.length;
        for (int i = 0; i < len/2; i++) {
            if (ch[i] != ch[len - i -1]){
                return false;
            }
        }
        return true;
    }
    public static boolean PalindromeTwo(String str){
        str = str.toLowerCase().replaceAll("[^a-z]","");
        return isPalindrome(str);
    }

    public static void main(String[] args) {
        System.out.println(PalindromeTwo("Noel - sees Leo"));
    }
}
