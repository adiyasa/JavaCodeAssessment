import java.util.HashMap;

public class StringScramble {
    static boolean stringScramble(String str1, String str2){
        HashMap<String,Integer> map1 = new HashMap<>();
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        for(String a:arr1){
            if (map1.containsKey(a)) map1.put(a,map1.get(a) +1);
            else map1.put(a,1);
        }
        for (String a:arr2){
            if(map1.containsKey(a)) map1.put(a,map1.get(a)-1);
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(stringScramble("rkqodlw", "asd"));
    }
}
