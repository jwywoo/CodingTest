import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N;
    static Elem[] B;
    static int[] P;

    static void input() {
        N = sc.nextInt();
        B = new Elem[N];
        P = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = new Elem();
            B[i].num = sc.nextInt();
            B[i].idx = i;
        }
    }

    static class Elem implements Comparable<Elem> {
        // Here
        public int num, idx;

        @Override
        public int compareTo(Elem other) {
            if (num != other.num) return num - other.num;
            return idx - other.idx;
        }
    }

    static void pro() {
        // Sorting
        Arrays.sort(B);
        // Filling up
        for (int bIdx = 0; bIdx < N; bIdx++) {
            P[B[bIdx].idx] = bIdx;

        }
        // Printing
        for (int i = 0; i < N; i++) {
            sb.append(P[i]).append(' ');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}