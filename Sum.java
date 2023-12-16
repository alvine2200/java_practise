public class Sum {

  public static void main(String[] args) {
    int[] nums = { 2, 6, 7, 4, 90, 78 };
    int sum = 0;

    for (int num = 0; num < nums.length; num++) {
      sum += nums[num];
    }

    System.out.println(sum);
  }
}
