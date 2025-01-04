public class Reverse {

    public static void main(String[] args){
        System.out.println(StringReverseArrayords());
    }


    //word = any words like go, come, love, testing, sessions
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


    //reverse String in Array

    public static boolean StringReverseArrayords(){
        String[] words = {"apple", "banana", "cherry", "date"};
        System.out.println("Original Words : ");
        for (String word : words){
            System.out.println(word + " ");
        }

        reverseArray(words);
        System.out.println("\nArray After Reversing Order:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        return false;
    }

    public static void reverseArray(String[] words){
        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }
    }

}
