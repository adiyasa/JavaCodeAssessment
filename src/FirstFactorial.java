public class FirstFactorial {
    public static int firstFactorial(int input){

        int sum = 1;
        for(int i = 1; i<=input; i++){
            sum = sum*i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(firstFactorial(8));
    }
}
