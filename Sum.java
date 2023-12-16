public class Sum {

  public static void main(String[] args) {
    int[] nums = { 2, 6, 7, 4, 90, 78 };
    int sum = 0;

    for (int num = 0; num < nums.length; num++) {
      sum += nums[num];
    }

    System.out.println(sum);

    difference();
  }

  public static void difference() {
        int[] numbers = { 2, 6, 7, 4, 90, 78 };
        int dif=1000;

        for(int number=0; number < numbers.length; number++)
        {
            dif -=  numbers[number];
        }

        System.out.println(dif);
  }
}
