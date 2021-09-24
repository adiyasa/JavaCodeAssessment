import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        char[] chars = new char[]{'A','b','c','d','E','f','g','h','I','j','k','l','m','n','O','p','q','r','s','t',
                'U','v','w','x',
                'y','z'};
        //System.out.println(chars[Character.getNumericValue('z')-9]);
        String test = "test";
        chars = test.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c:chars) {
            if(map.containsKey(c))map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        System.out.println(4 & 4-1);

    }
}
