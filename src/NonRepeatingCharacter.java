import java.util.HashMap;

public class NonRepeatingCharacter {
    public static String nonRepeatingCharacter(String input){

        char[] chars = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c:chars) {
            if(map.containsKey(c))map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for (char c: map.keySet()){
            if (map.get(c)==1) return String.valueOf(c);
        }

        return "false";
    }

    public static void main(String[] args) {
        System.out.println(nonRepeatingCharacter("agettkgaeee"));
    }
}
