import java.util.Arrays;

public class Main {
    // the length of the array
    static int M = 3;
    static int N = 3;

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {5, 10, 20}, {9, 22, 28}};

        reverseArray(arr);
    }
    // Function to reverse and given 2D arr[][]
    public static int reverseArray(int[][] arr) {

    // Traverse each row of arr[][]
        for (int i = 0; i < M; i++) {

    // Initialise start and end index
            int start = 0;
            int end = N - 1;

    // till start / end swap the element at start and end index
            while (start < end) {

    // Swap the element
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
    // Increment start and decrement end for next pair of swapping
                start++;
                end--;
            }
        }
    //print the arr[][]
        System.out.println(Arrays.deepToString(arr));
        return arr.length;
    }
}



