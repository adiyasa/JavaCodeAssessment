public class ArithGeo {
    public static String ArithGeo(int[] input){
        if (input.length <2)return "-1";
        int arithInterval = input[1]-input[0];
        int geoInterval = input[1]/input[0];
        int arithCount = 1;
        int geoCount = 1;
        for (int i=1;i<input.length; i++){
            if(input[i] - input[i-1] == arithInterval){
                arithCount++;
            }
            if(input[i]/input[i-1] == geoInterval){
                geoCount++;
            }
        }
        if(arithCount == input.length)return "Arithmetic";
        if(geoCount == input.length)return "Geometric";
        return "-1";
    }

    public static void main(String[] args) {
        System.out.println(ArithGeo(new int[]{2, 4, 6, 8}));
    }
}
