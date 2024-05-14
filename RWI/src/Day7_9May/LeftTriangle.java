package Day7_9May;

public class LeftTriangle {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Left triangle elements:");

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}

