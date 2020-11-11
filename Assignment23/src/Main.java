public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3 , 6, 7, 7, 8};
        System.out.println(findDuplicateNum(array));
    }

    public static int findDuplicateNum(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return 0;

    }
}