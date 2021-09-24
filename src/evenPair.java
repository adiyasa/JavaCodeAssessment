import java.util.Locale;

public class evenPair {
    public static void main(String[] args) {
        System.out.println(evenPairs("7r5gg812"));
    }
    public static boolean isEvenPair(String str)
    {
        char[] ch = str.toCharArray();
        int a =0;
        for (char c :
             ch) {
            if (c%2 == 0)
            {
                a++;
            }
            
        }
        return a>1;
    }
    public static boolean evenPairs(String s)
    {
        boolean result = false;
        String [] arrStr = splitNumber(s);
        for (String str: arrStr) {
            if (str =="")
            {
                continue;
            }
            else
            {
                result = isEvenPair(str);
            }
            if (result)
            {
                break;
            }
        }
        return result;
    }
    static String[] splitNumber(String str)
    {
        return str.toLowerCase().split("[^\\d]");
    }
}
