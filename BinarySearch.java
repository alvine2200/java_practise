import java.util.Arrays;

public class BinarySearch {

    //Binary search is an efficient algorithm for finding an item from a sorted list of items.
    // It works by repeatedly dividing the search interval in half.
    // If the value of the search key is less than the item in the middle of the interval,
    // the search continues in the lower half; otherwise, it continues in the upper half.
    // This process continues until the value is found or the interval is empty.
    public static void main(String[] args) {
        int result = binarySearchInteger();
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



//    public static int binarySearch(String[] arr, String target) {
//        int low = 0, high = arr.length - 1;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            int comparison = arr[mid].compareTo(target);
//            if (comparison == 0) {
//                return mid; // Target found
//            } else if (comparison < 0) {
//                low = mid + 1; // Search in the right half
//            } else {
//                high = mid - 1; // Search in the left half
//            }
//        }
//        return -1; // Target not found
//    }
//
//    public static void main(String[] args) {
//        String[] arr = {"apple", "banana", "cherry", "date", "fig", "grape"};
//        String target = "cherry";
//
//        int result = binarySearch(arr, target);
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found.");
//        }
//    }



}
