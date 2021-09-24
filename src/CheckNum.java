public class CheckNum {
    public static String checkNum(int num1, int num2){
        if (num1 == num2){
            return "-1";
        }
        return num1<num2? "true":"false";
    }

    public static void main(String[] args) {
        System.out.println(checkNum(15,13));
    }
}
