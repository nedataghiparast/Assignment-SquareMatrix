public class Main {
    public static void main(String[] args) { // This is my main method
        int[] array = {1, 3 , 6, 7, 7, 8}; // This is the integer array initialization
        System.out.println(findDuplicateNum(array)); // This is invoking my method and printing it
    }

    public static int findDuplicateNum(int[] nums) { // This is my method for finding duplicate number of an array of integer
        for (int i = 1; i <= nums.length; i++) { // This is the for loop it starts from the second value of the array and iterates until it is at the last value of the array
            if (nums[i] == nums[i - 1]) { // This if statement checks if the index i of the array equals the previous index of the array
                return nums[i]; // If they match, returns the number
            }
        }

        return 0; // Returns 0 if there is no duplicate

    }
}