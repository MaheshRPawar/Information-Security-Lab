import java.util.Scanner;

public class DiffieHellman {

    static long powerMod(long base, long exponent, long mod) {
        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result = (result * base) % mod;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prime number P: ");
        long p = sc.nextLong();

        System.out.print("Enter primitive root G: ");
        long g = sc.nextLong();

        System.out.print("Enter Alice's private key a: ");
        long a = sc.nextLong();

        System.out.print("Enter Bob's private key b: ");
        long b = sc.nextLong();

        long x = powerMod(g, a, p);
        long y = powerMod(g, b, p);

        long aliceKey = powerMod(y, a, p);
        long bobKey = powerMod(x, b, p);

        System.out.println("\nAlice's generated key: " + x);
        System.out.println("Bob's generated key: " + y);

        System.out.println("\nAlice's secret key: " + aliceKey);
        System.out.println("Bob's secret key: " + bobKey);

        if (aliceKey == bobKey) {
            System.out.println("\nShared secret key: " + aliceKey);
        } else {
            System.out.println("\nKeys do not match.");
        }

        sc.close();
    }
}
