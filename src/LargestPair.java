public class LargestPair {
    public static int largestPair(int input){

        char[] chars = String.valueOf(input).toCharArray();
        int largestNumber = Integer.MIN_VALUE;
        int prev = Character.getNumericValue(chars[0]);
        for (int i = 1; i < chars.length; i++){
            int now = Character.getNumericValue(chars[i]);
            if(largestNumber < (prev * 10) + prev)largestNumber = prev * 10 + now;
            prev = now;
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        System.out.println(largestPair(4759472));
    }
}
