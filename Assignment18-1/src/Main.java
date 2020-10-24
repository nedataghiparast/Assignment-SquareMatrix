import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] someNum = runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(someNum));

    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;

        }
        return result;

    }

}



