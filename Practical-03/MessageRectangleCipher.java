import java.util.Scanner;

public class MessageRectangleCipher {

    static String encrypt(String text, int columns) {

        text = text.replaceAll("\\s+", "").toUpperCase();

        int rows = (int) Math.ceil((double) text.length() / columns);

        char[][] matrix = new char[rows][columns];

        int index = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (index < text.length())
                    matrix[i][j] = text.charAt(index++);
                else
                    matrix[i][j] = 'X';
            }
        }

        StringBuilder encrypted = new StringBuilder();

        for (int j = 0; j < columns; j++) {

            for (int i = 0; i < rows; i++) {

                encrypted.append(matrix[i][j]);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Plain Text : ");
        String text = scanner.nextLine();

        System.out.print("Enter Number of Columns : ");
        int columns = scanner.nextInt();

        System.out.println("\nEncrypted Text : " + encrypt(text, columns));

        scanner.close();
    }
}
