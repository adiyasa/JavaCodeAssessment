public class FirstReverse {
    public static String firstReverse(String input){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);

        return String.valueOf(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        System.out.println(firstReverse("Hello World"));
    }
}
