public class PrimeMover {
    static int primeMover(int n){
        int primes = 0, num = 1;
        while (primes<n){
            if(IsPrime.isPrime(num)){
                primes++;
            }
            num++;
        }
        return num-1;
    }

    public static void main(String[] args) {
        System.out.println(primeMover(1000));
        //System.out.println(IsPrime.isPrime(2));
    }
}
