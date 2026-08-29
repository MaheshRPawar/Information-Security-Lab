import java.util.Scanner;

public class RSA {

    static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int findD(int e, int phi) {

        for (int d = 1; d < phi; d++) {
            if ((e * d) % phi == 1)
                return d;
        }

        return -1;
    }

    static long powerMod(long base, long exponent, long modulus) {

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulus;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first prime number (p): ");
        int p = scanner.nextInt();

        System.out.print("Enter second prime number (q): ");
        int q = scanner.nextInt();

        int n = p * q;
        int phi = (p - 1) * (q - 1);

        System.out.println("\nN = " + n);
        System.out.println("Phi(N) = " + phi);

        System.out.print("Enter value of e: ");
        int e = scanner.nextInt();

        if (gcd(e, phi) != 1) {
            System.out.println("Invalid value of e.");
            System.out.println("e and Phi(N) must be relatively prime.");
            scanner.close();
            return;
        }

        int d = findD(e, phi);

        if (d == -1) {
            System.out.println("Private key could not be generated.");
            scanner.close();
            return;
        }

        System.out.println("\nPublic Key  : (" + e + ", " + n + ")");
        System.out.println("Private Key : (" + d + ", " + n + ")");

        System.out.print("\nEnter message (number less than " + n + "): ");
        int message = scanner.nextInt();

        if (message >= n) {
            System.out.println("Message must be less than N.");
            scanner.close();
            return;
        }

        long cipherText = powerMod(message, e, n);

        System.out.println("Encrypted Message : " + cipherText);

        long plainText = powerMod(cipherText, d, n);

        System.out.println("Decrypted Message : " + plainText);

        scanner.close();
    }
}
