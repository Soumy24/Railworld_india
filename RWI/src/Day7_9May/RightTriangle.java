package Day7_9May;

public class RightTriangle {

    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Right triangle elements:");

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}

