import java.util.HashMap;

public class BasicRomanNumeral {
    public static int basicRomanNumeral(String str){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        char[] chars = new StringBuilder(str).reverse().toString().toCharArray();
        int prevNum = 0;
        int sum = 0;
        for(char c : chars){
            int thisNum = map.get(Character.toString(c));
            if (thisNum > prevNum){
                sum += thisNum;
            }
            else sum -= thisNum;
            prevNum = thisNum;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(basicRomanNumeral("CMXCIX"));

    }
}
