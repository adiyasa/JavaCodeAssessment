import java.util.Arrays;

public class LargestFour {
    public static int largestFour(int[] input){
        int sum = 0;
        if (input.length < 4){
            for (int i: input)sum +=i;
        }
        else {
            Arrays.sort(input);
            for (int i = input.length - 4; i < input.length; i++) {
                sum += input[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(largestFour(new int[]{4, 5, -2, 3}));
    }
}
