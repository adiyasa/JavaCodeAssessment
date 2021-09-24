import java.util.HashMap;

public class MeanMode {
    public static int meanMode(int[] input){

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for (int i: input){
            if (map.containsKey(i))map.put(i,map.get(i)+1);
            else map.put(i,1);
            sum += i;
        }
        if(sum % input.length != 0){
            return 0;
        }
        int average = sum/input.length;
        int modulo = 0;
        for (int i:map.keySet()){
            if (modulo < map.get(i)) modulo = i;
        }
        return average == modulo ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(meanMode(new int[]{64, 64, 64, 64, 64, 64, 64, 64, 1024}));
    }
}
