# Practical No. 06

## Experiment

Implementation of Diffie-Hellman Key Exchange Algorithm

---

## Aim

To design, develop and execute a program to implement Diffie-Hellman key exchange algorithm.

## Theory

Diffie-Hellman key exchange is a method for securely exchanging a shared secret key over an insecure channel.

Alice and Bob agree on a prime number P and a primitive root G. Alice selects a private value a and Bob selects a private value b.

Alice calculates:

x = G^a mod P

Bob calculates:

y = G^b mod P

They exchange x and y publicly.

Alice calculates:

ka = y^a mod P

Bob calculates:

kb = x^b mod P

Both obtain the same shared secret key.

## Algorithm

1. Select a prime number P and primitive root G.
2. Alice selects a private value a.
3. Bob selects a private value b.
4. Alice calculates x = G^a mod P.
5. Bob calculates y = G^b mod P.
6. Alice and Bob exchange x and y.
7. Alice calculates ka = y^a mod P.
8. Bob calculates kb = x^b mod P.
9. Compare both keys.
10. If both keys are equal, the shared secret key is generated.

## Example

```text
P = 23
G = 9

Alice's private key:
a = 4

Bob's private key:
b = 3

Alice:
x = 9^4 mod 23
x = 6

Bob:
y = 9^3 mod 23
y = 16

Alice:
ka = 16^4 mod 23
ka = 9

Bob:
kb = 6^3 mod 23
kb = 9

Shared secret = 9
```

## How to Compile

```bash
javac DiffieHellman.java
```

## How to Run

```bash
java DiffieHellman
```

## Sample Output

```text
Enter prime number P: 23
Enter primitive root G: 9
Enter Alice's private key a: 4
Enter Bob's private key b: 3

Alice's generated key: 6
Bob's generated key: 16

Alice's secret key: 9
Bob's secret key: 9

Shared secret key: 9
```

## Conclusion

The Diffie-Hellman key exchange algorithm was implemented successfully. Alice and Bob generated the same shared secret key without directly exchanging the secret key.
