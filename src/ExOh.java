import java.util.HashMap;

public class ExOh {
    public static String exOh(String input){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++){
            char thisChar = input.charAt(i);
            if(map.containsKey(thisChar))map.put(thisChar, map.get(thisChar)+1);
            else map.put(thisChar,0);
        }

        return (map.get('x') == map.get('o'))||(map.size() == 0) ? "true":"false";
    }

    public static void main(String[] args) {
        System.out.println(exOh(""));
    }
}
