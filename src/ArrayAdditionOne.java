import java.util.Arrays;

public class ArrayAdditionOne {
    public static String arrayAdditionOne(int[] arr){
        Arrays.sort(arr);
        int largeNumber = arr[arr.length-1];
        int sum = 0;
        for(int i = 0;i<arr.length-1;i++){
            sum += arr[i];
        }
        if (sum == largeNumber)return "true";
        for(int i = 0; i <arr.length; i++){
            if (sum - arr[i] == largeNumber)return "true";
        }
        return "false";

    }

    public static void main(String[] args) {
        System.out.println(arrayAdditionOne(new int[]{4, 6, 23, 10, 1, 3}));
    }
}
