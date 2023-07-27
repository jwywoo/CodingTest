package org.example;

import java.util.Scanner;

public class CodingTestPartialSumOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] givenInt = new int[N + 1];
        int[] givenSum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            givenInt[i] = sc.nextInt();
            if (i == 1) {
                givenSum[i] = givenInt[i];
            } else {
                givenSum[i] = givenSum[i - 1] ^ givenInt[i];
            }
        }

        int result = 0;
        for (int i = 1; i <= X; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            result ^= givenSum[end] ^ givenSum[start-1];
        }

        System.out.println(result);
    }
}
