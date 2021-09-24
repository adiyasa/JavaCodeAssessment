public class BitWiseOne {
    static String bitWiseOne(String[] arr){
        char[] chars1 = arr[0].toCharArray();
        char[] chars2 = arr[1].toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<chars1.length; i++){
            if(chars1[i] == '1'|| chars2[i] == '1'){
                stringBuilder.append("1");
            }
            else stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(bitWiseOne(new String[]{"1001", "0100"}));
    }
}
