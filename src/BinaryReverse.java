public class BinaryReverse {
    static int binaryReverse(String str){
        int num = Integer.valueOf(str);
        String binary = Integer.toBinaryString(Integer.valueOf(str));
        System.out.println(binary);
        StringBuilder stringBuilder = new StringBuilder();
        if(binary.length() <8){
            int diff = 8- binary.length();
            for (int i = 0; i<diff; i++){
                binary = "0"+binary;
            }
        }
        System.out.println(binary);
        stringBuilder.append(binary);
        stringBuilder.reverse();

        return Integer.parseInt(stringBuilder.toString(),2);
    }

    public static void main(String[] args) {
        System.out.println(binaryReverse("47"));
    }
}
