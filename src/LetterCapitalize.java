public class LetterCapitalize {
    public static String letterCapitalize(String input){

        String[] arr = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            stringBuilder.append(arr[i].substring(0,1).toUpperCase()).append(arr[i].substring(1));
            stringBuilder.append(" ");
        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(letterCapitalize("The soul becomes dyed with the color of its thoughts."));
    }
}
