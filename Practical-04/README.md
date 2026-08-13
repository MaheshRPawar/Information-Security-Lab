# Practical No. 04

## Experiment

Implementation of Single Round of DES Algorithm

## Aim

To design, develop and execute a program to implement Single Round of DES Algorithm.

## Theory

Data Encryption Standard (DES) is a symmetric block cipher algorithm that works on 64-bit blocks of plaintext. DES uses a Feistel structure with 16 rounds, where a different round key is used for each round.

A single DES round consists of key transformation, expansion permutation, S-box substitution, P-box permutation, XOR and swap operations.

## Algorithm

1. Read 64-bit plaintext and 64-bit key.
2. Perform Initial Permutation on the plaintext.
3. Divide the result into Left and Right 32-bit halves.
4. Generate the first 48-bit round key using key transformation.
5. Expand the Right half from 32 bits to 48 bits.
6. XOR the expanded Right half with the round key.
7. Divide the result into eight 6-bit blocks and perform S-box substitution.
8. Perform P-box permutation on the 32-bit S-box output.
9. XOR the P-box output with the Left half.
10. Swap the Left and Right halves.
11. Display the result after one DES round.

## Main DES Stages

```text
64-bit Plaintext
       ↓
Initial Permutation
       ↓
L0 + R0
       ↓
Expansion
       ↓
XOR with Round Key
       ↓
S-Box Substitution
       ↓
P-Box Permutation
       ↓
XOR with Left Half
       ↓
Swap
       ↓
L1 + R1
```

## Time Complexity

O(1)

## Space Complexity

O(1)

## How to Compile

```bash
javac DES.java
```

## How to Run

```bash
java DES
```

## Sample Input

```text
Enter 64-bit Plain Text : 0001001000110100010101100111100010011010101111001101111011110001
Enter 64-bit Key : 0001001100110100010101110111100110011011101111001101111111110001
```

## Sample Output

```text
After Initial Permutation : 1100110011111111011001101000000011110000101010100111100001010101
Left Half (L0)            : 11001100111111110110011010000000
Right Half (R0)           : 11110000101010100111100001010101
Round Key (K1)            : 000110110000001011101111111111000111000001110010
After Expansion           : 111110100001010101010100001111110000001010101011
After XOR with Key        : 111000010001011110111011110000110111001011011001
After S-Box               : 00111100100001111111011110010000
After P-Box               : 10100011011011000011001110011011
New Left (L1)             : 11110000101010100111100001010101
New Right (R1)            : 01101111100100110101010100011011

Single Round Output       : 1111000010101010011110000101010101101111100100110101010100011011
```

## Conclusion

The single round of the DES algorithm was implemented successfully. The program performs the main DES operations including permutation, key transformation, expansion, S-box, P-box, XOR and swap.
