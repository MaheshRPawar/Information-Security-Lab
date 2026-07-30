import java.util.Scanner;

public class RailFenceCipher {

    static String encrypt(String text, int depth) {

        if (depth <= 1)
            return text;

        StringBuilder[] rails = new StringBuilder[depth];

        for (int i = 0; i < depth; i++)
            rails[i] = new StringBuilder();

        int row = 0;
        boolean down = true;

        for (char ch : text.toCharArray()) {

            if (ch != ' ')
                rails[row].append(ch);

            if (row == 0)
                down = true;
            else if (row == depth - 1)
                down = false;

            if (down)
                row++;
            else
                row--;
        }

        StringBuilder encrypted = new StringBuilder();

        for (StringBuilder rail : rails)
            encrypted.append(rail);

        return encrypted.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Plain Text : ");
        String text = scanner.nextLine();

        System.out.print("Enter Depth : ");
        int depth = scanner.nextInt();

        System.out.println("\nEncrypted Text : " + encrypt(text, depth));

        scanner.close();
    }
}
