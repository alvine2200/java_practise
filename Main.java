public class Main {
    public static void main(String[] args) {
       int[] nums = {2,6,7,4,90,78};
       int sum=0;

       for (int num=0; num < nums.length; num++)
       {
           sum += nums[num];
       }

//        System.out.println(addition(new int[]{1, 2, 4, 5, 9, 19, 2, 1, 35, 23, 17, 4}));
        System.out.println(add_arrays());
    }

    //adding arrays
    public static int add_arrays(){
        int[] array1 = {1,9,7,0,9,3};
        int[] array2 = {9,4,2,1,6,5};

        int[] combinedArray = new int[array1.length + array2.length];

        System.arraycopy(array1,0, combinedArray,0, array1.length);
        System.arraycopy(array2,0, combinedArray, array1.length, array2.length);

        int totalSum = 0;

        //find sum of array
        for(int num : combinedArray){
         totalSum += num;
        }

        System.out.println("Total Sum: " + totalSum);
        System.out.println("Smallest Value : " + combinedArray[0]);
        System.out.println("Largest Value : " + combinedArray[combinedArray.length - 1]);
        System.out.println("Second Largest Value : " + combinedArray[combinedArray.length - 2]);
        return totalSum;
    }



    //adding values of arrays
    public static Integer addition(int[] args){
        int[] nums = args;
        Integer sum = 0;

        for (int num = 0; num < nums.length; num++){
            sum += nums[num];
        }

        System.out.println(sum);
        return sum;
    }


}