public class PowerOfTwo {
    public static String powerOfTwo(int input){
        int bitwise = input & input-1;
        return input>0 || bitwise == 0 ? "true":"false";
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(8));
    }
}
