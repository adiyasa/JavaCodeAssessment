public class NumberAddition {
    public static int numberAddition(String input){
        String[] inputs = input.replaceAll("[^0-9]"," ").split(" ");
        int sum = 0;
        for(String str:inputs){
            if(str != "") sum += Integer.valueOf(str);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numberAddition("88Hello 3World"));
    }
}
