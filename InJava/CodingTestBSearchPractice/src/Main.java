import java.util.Arrays;
import java.util.Scanner;

// BOJ 2805 Cutting Trees
public class Main {
    static Scanner sc = new Scanner(System.in);

    static int N, M;
    static int A[];


    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N+1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
    }

    static boolean determination(int H) {
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            if (A[i] > H) {
                sum += A[i] - H;
            }
        }
        return sum >= M;
    }

    static void pro() {
        long L = 0, R = 2000000000, ans = 0;
        while (L <= R) {
            int mid = (int) ((L + R) / 2);
            if (determination(mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}