public class PalindromeMaker {
    public static String palindromeMaker(String input){
        if (Palindrome.isPalindrome(input))return "palindrome";

        char[]chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int pair = chars.length;
        for (int i = 0; i < pair/2; i++){

            if(chars[i] != chars[pair - i - 1]){
                stringBuilder.append(chars[i]);
                stringBuilder.append(chars[pair - i -1]);
            }
        }


        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(palindromeMaker("abjchba"));
    }
}
