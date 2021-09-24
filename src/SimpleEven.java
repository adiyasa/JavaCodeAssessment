public class SimpleEven {
    public static String simpleEven(int input){
        String[] nums = String.valueOf(input).split("");
        for (String s:nums) {
            if (Integer.parseInt(s)%2 !=0){
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(simpleEven(460222));
    }
}
