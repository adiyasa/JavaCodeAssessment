import java.util.Arrays;

public class AlphabethSort {
    public static String alphabethSort(String string){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(alphabethSort("hello"));
    }
}
