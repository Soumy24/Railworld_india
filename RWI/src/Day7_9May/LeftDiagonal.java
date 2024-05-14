package Day7_9May;

public class LeftDiagonal {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Left diagonal elements:");

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print(matrix[i][i] + " ");

        }

        System.out.println();
    }
}
