import java.util.Hashtable;

public class RunLength {
    static StringBuilder runLength(String str){
        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();
        int count = 1;
        for (int i=1; i<ch.length; i++)
        {
            if(ch[i]==ch[i-1]){
                count++;
            }
            else {
                result.append(count).append(ch[i-1]);
                count = 1;
            }
        }
        result.append(count).append(ch[ch.length-1]);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(runLength("wwwggopp"));
    }

}
