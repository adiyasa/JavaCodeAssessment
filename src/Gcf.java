public class Gcf {
    public static int gcf(int[] arr){
        if (arr[1] == 0 || arr[0] == 0){
            return arr[1]+arr[0];
        }
        return gcf(new int[]{arr[1], arr[0]%arr[1]});
    }

    public static void main(String[] args) {
        System.out.println(gcf(new int[]{12, 28}));
    }
}
