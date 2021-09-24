public class DashInsert {
    public static String dashInsert(String input){

        char[] ch = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        char prev = ch[0];
        stringBuilder.append(ch[0]);
        for (int i = 1; i < ch.length; i++){
            if (Character.getNumericValue(ch[i])%2 == 1 &
                    Character.getNumericValue(prev)%2 == 1)stringBuilder.append("-");
            stringBuilder.append(ch[i]);
            prev = ch[i];
        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(dashInsert("25928"));
    }
}
