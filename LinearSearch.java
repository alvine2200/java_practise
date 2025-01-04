import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args){
        int target = 90;
        int[] numbers = {10,40,90,70,30,20,30,50};
        System.out.println(searchMultipleOccurreneInAnArray());
    }

    //search for int
    private static int linearSearch(int [] numbers,int target){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                return numbers[i];
            }
        }
        return -1;
    }

    //search for String
    public static String searchForStringValues(String [] values,String targetString){
        for (int i= 0; i < values.length; i ++){
            if (targetString.equals(values[i])){
                return values[i];
            }
        }
        return "Not Found";
    }


    //multiple occurrence search

    public static List<Integer> searchMultipleOccurreneInAnArray(){
        int[] numbers = {10, 20, 30, 20, 50, 20};
        int target = 20;
        List<Integer> foundNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                foundNumbers.add(numbers[i]);
            }
        }
        System.out.println("Counted numbers found : " + foundNumbers.toArray().length);
        return foundNumbers;
    }

}
