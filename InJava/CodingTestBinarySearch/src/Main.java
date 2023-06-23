import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int N;
    static int M;

    static int[] B;
    static int[] A;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        A = new int[N + 1];
        B = new int[M + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 1; i <= M; i++) {
            B[i] = scan.nextInt();
        }
    }

    static int lower_bound(int[] A, int L, int R, int X) {
        int result = L-1;
        while (L <= R) {
            int mid = (L + R)/2;
            if(A[mid] < X) {
                result = mid;
                L = mid + 1;
            } else if (A[mid] >= X) {
                R = mid - 1;
            }
        }
        return result;
    }

    static void pro() {
        // Sort the target group
        Arrays.sort(B, 1, M+1);

        // Binary Search
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += lower_bound(B, 1, M, A[i]);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int TT;
        TT = scan.nextInt();
        for (int tt = 1; tt <= TT; tt++) {
            input();
            pro();
        }
    }
}