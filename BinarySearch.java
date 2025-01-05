import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    //Binary search is an efficient algorithm for finding an item from a sorted list of items.
    // It works by repeatedly dividing the search interval in half.
    // If the value of the search key is less than the item in the middle of the interval,
    // the search continues in the lower half; otherwise, it continues in the upper half.
    // This process continues until the value is found or the interval is empty.
    public static void main(String[] args) {
        int result = binarySearchStringArray();
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }


    public static int binarySearchInteger(){
        int[] numbers = {3,6,1,5,0,9,7,28,8};
        int target = 0;

        int low = 0;
        int high = numbers.length - 1;

        Arrays.sort(numbers);
        System.out.println("Sorted Array " + Arrays.toString(numbers));

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target){
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;  //search in right half
            }else {
                high = mid - 1; //search in left half
            }
        }
        return -1;
    }



    public static int binarySearchStringArray() {
        String[] arr = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String target = "cherry";

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int comparison = arr[mid].compareTo(target);
            if (comparison == 0){
                System.out.println("found string " + arr[mid]);
                return mid;
            }else if (comparison < 1){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }


    public static int binarySearch() {
        int[] numbers = {9,1,7,3,4,2,8,6,12};
        int target = 6;

        int low = 0;
        int high = numbers.length - 1;

        Arrays.sort(numbers);
        System.out.println("Sorted Arrays " + Arrays.toString(numbers));
        System.out.println("Count Number of Arrays " + Arrays.stream(numbers).toArray().length);
        System.out.println("Sum of Array Values " + Arrays.stream(numbers).sum());

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target){
                System.out.println("Target found is : " + numbers[mid]);
                return numbers[mid];
            }else if (numbers[mid] < target){
                low = mid + 1;  //search in right half
            }else{
                high = mid - 1;  //search in left half
            }
        }

        return -1;
    }

    public static List<Integer> linearSearch(){
        int[] numbers = {9,1,6,3,6,2,8,6,12};
        int target = 6;
        List<Integer> foundNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                System.out.println();
                foundNumbers.add(numbers[i]);
            }
        }
        return foundNumbers;
    }


}
