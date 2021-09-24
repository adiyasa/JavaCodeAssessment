import java.util.*;

public class PrimeChecker {
    private static final ArrayList<Integer> permutations = new ArrayList<Integer>();
    /*public static void permute(List<Integer> arr, int k)
    {
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr,i,k);
            permute(arr, k+1);
            Collections.swap(arr,k,i);
        }
        if (k == arr.size()-1){
            permutation.add(Integer.parseInt(arr.toString()));
            System.out.println(Integer.parseInt(arr.toString()));
            a
        }
    }*/

    static void getPermutations(char[] coll, int index){
        if (index == coll.length - 1) {
            permutations.add(Integer.parseInt(String.valueOf(coll)));
            System.out.println(permutations.get(permutations.size()-1));
        }
        for (int i = index; i < coll.length; i++) {
            swap(coll, index, i);
            getPermutations(coll, index + 1);
            swap(coll, index, i);
        }
    }

    static void swap(char[] arr,int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int permute(int num){
        char[] coll = String.valueOf(num).toCharArray();
        getPermutations(coll,0);
        for (int i = 0; i<permutations.size(); i++){
            if(IsPrime.isPrime(permutations.get(i)))
            {
                return 1;
            }
        }
        return 0;


    }

    public static void main(String[] args) {
        System.out.println(permute(910));
    }
}
