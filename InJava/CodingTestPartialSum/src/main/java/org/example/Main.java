package org.example;

import java.util.Scanner;

// 11659
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] givenInt = new int[N+1];
        int[] givenSum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            givenInt[i] = sc.nextInt();
            givenSum[i] = givenSum[i-1] + givenInt[i];
        }

        for (int i = 1; i <= M; i++) {
            int rangeStart = sc.nextInt();
            int rangeEnd = sc.nextInt();
            System.out.println(givenSum[rangeEnd] - givenSum[rangeStart - 1]);
        }
    }
}