import java.util.HashSet;
import java.util.Set;

public class DistinctCharacters {
    public static String distinctCharacters(String input){

        Set<Character> set = new HashSet<>();
        char[] chars = input.toCharArray();
        for (char ch: chars){
            set.add(ch);
        }

        return set.size()>9 ? "true": "false";
    }

    public static void main(String[] args) {
        System.out.println(distinctCharacters("abc123kkmmmm?j"));
    }
}
