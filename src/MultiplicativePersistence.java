public class MultiplicativePersistence {
    public static int multiplicativePersistence(int input){
        int times = 0;
        while(input>9){
            int mul = 1;
            String[] num = Integer.toString(input).split("");
            for (String str: num){
                mul *= Integer.valueOf(str);
            }
            input = mul;
            times++;
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println(multiplicativePersistence(39));
    }
}
