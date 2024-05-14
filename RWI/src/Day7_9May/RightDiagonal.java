package Day7_9May;

public class RightDiagonal
{

    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Right diagonal elements:");

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }

        System.out.println();
    }
}
