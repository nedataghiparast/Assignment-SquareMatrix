import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> line1 = new ArrayList<>();
        line1.add(1);
        line1.add(2);
        line1.add(3);
        List<Integer> line2 = new ArrayList<>();
        line2.add(4);
        line2.add(5);
        line2.add(6);
        List<Integer> line3 = new ArrayList<>();
        line3.add(9);
        line3.add(8);
        line3.add(9);

        List<List<Integer>> squareMatrix = new ArrayList<>();
        squareMatrix.add(line1);
        squareMatrix.add(line2);
        squareMatrix.add(line3);

        System.out.println(squareMatrix);

        System.out.println(squareMatrix.get(0).get(0));
        int first = squareMatrix.get(0).get(0);
        System.out.println(squareMatrix.get(1).get(1));
        int second = squareMatrix.get(1).get(1);
        System.out.println(squareMatrix.get(2).get(2));
        int third = squareMatrix.get(2).get(2);
        int num = first + second + third;

        System.out.println(squareMatrix.get(0).get(2));
        int one = squareMatrix.get(0).get(2);
        System.out.println(squareMatrix.get(1).get(1));
        int two = squareMatrix.get(1).get(1);
        System.out.println(squareMatrix.get(2).get(0));
        int three = squareMatrix.get(2).get(0);
        int num2 = one + two + three;

        int num3 = Math.abs(num - num2);
        System.out.println("The difference is " + num3);

    }

    private static int diagonalDifference(List<List<Integer>> squareMatrix) {
        int sum2 = 0;
        int sum3 = 0;
        int[][] matrix = new int[0][];
        for (int i = 0; i < matrix.length; i++) {
            sum2 += matrix[i][i];
            sum3 += matrix[i][matrix.length - i - 1];

        }
        return Math.abs(sum2 - sum3);
    }

}


