public class AddictivePersistence {
    public static int addictivePersistence(int n){
        int times = 0;
        while (n > 9){
            int sum = 0;
            String[] strings = Integer.toString(n).split("");
            for (String string: strings){
                sum += Integer.valueOf(string);
            }
            n = sum;
            times++;
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println(addictivePersistence(2718 ));
    }
}
