public class CamelCase {
    public static String camelCase(String str){
        String[] words = str.toLowerCase().replaceAll("[^a-z]"," ").trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(words[0]);
        for (int i = 1; i< words.length; i++){
            stringBuilder.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1));
        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("BOB loves-coding"));
    }
}
