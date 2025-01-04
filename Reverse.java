public class Reverse {

    public static void main(String[] args){
        System.out.println(StringReverse("iloveyou"));
    }


    public static String StringReverseArray(String word){
        char[] charArray = word.toCharArray();

        String reversedWord ="";

        for (int i = charArray.length - 1; i > 0; i--) {
            reversedWord += charArray[i];
        }
        System.out.println("Original Word: " + word);
        System.out.println("Reversed Word: " + reversedWord);
        return reversedWord;
    }


    public static String StringReverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
