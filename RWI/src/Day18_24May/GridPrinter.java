package Day18_24May;

public class GridPrinter {

    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        char character = '-';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
