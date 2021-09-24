import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbCheck {
    static String abCheck(String str){
        Pattern pattern = Pattern.compile("(a...b)|(b...a)");
        Matcher matcher = pattern.matcher(str);
        return matcher.find()?"true": "false";
    }

    public static void main(String[] args) {
        System.out.println(abCheck("bmrfa"));
    }
}
