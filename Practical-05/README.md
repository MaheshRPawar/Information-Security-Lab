# Practical No. 05

## Experiment

Implementation of RSA Algorithm

---

## Aim

To design, develop and execute a program to implement RSA Algorithm.

## Theory

RSA is a public key encryption technique. It is an asymmetric cryptographic algorithm that uses two keys: a public key and a private key.

The public key is shared publicly, while the private key is kept secret.

RSA uses two prime numbers to generate the keys.

## Algorithm

1. Choose two prime numbers p and q.
2. Calculate N = p × q.
3. Calculate φ(N) = (p - 1) × (q - 1).
4. Choose e such that e and φ(N) are relatively prime.
5. Calculate d such that (e × d) mod φ(N) = 1.
6. Public key is (e, N).
7. Private key is (d, N).
8. Encrypt the message using C = P^e mod N.
9. Decrypt the ciphertext using P = C^d mod N.
10. Display the encrypted and decrypted message.

## Example

```text
p = 3
q = 11

N = 3 × 11 = 33

φ(N) = (3 - 1)(11 - 1)
     = 20

e = 7

d = 3

Public Key  = (7, 33)
Private Key = (3, 33)

Message = 2

Encrypted Message = 2^7 mod 33
                  = 29

Decrypted Message = 29^3 mod 33
                  = 2
```

## How to Compile

```bash
javac RSA.java
```

## How to Run

```bash
java RSA
```

## Sample Output

```text
Enter first prime number (p): 3
Enter second prime number (q): 11

N = 33
Phi(N) = 20

Enter value of e: 7

Public Key  : (7, 33)
Private Key : (3, 33)

Enter message (number less than 33): 2
Encrypted Message : 29
Decrypted Message : 2
```

## Conclusion

The RSA algorithm was implemented successfully. The program generated public and private keys and performed encryption and decryption of the given message.
