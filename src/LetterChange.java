public class LetterChange {
    public static String letterChange(String input){

        char[] chars = new char[]{'A','b','c','d','E','f','g','h','I','j','k','l','m','n','O','p','q','r','s','t',
                'U','v','w','x',
                'y','z'};

        StringBuilder stringBuilder = new StringBuilder();
        char[] charInput =input.toLowerCase().toCharArray();
        for (char ch:charInput){
            try {
                char change = chars[Character.getNumericValue(ch) - 9];
                stringBuilder.append(change);
            } catch (IndexOutOfBoundsException err){
                char change = chars[0];
                stringBuilder.append(change);
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(letterChange("zzz"));
    }
}
