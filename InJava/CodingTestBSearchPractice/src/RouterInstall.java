import java.util.Arrays;
import java.util.Scanner;

public class RouterInstall {
    static Scanner sc = new Scanner(System.in);
    static int N, C;
    static int[] A;

    static void input() {
        N = sc.nextInt();
        C = sc.nextInt();
        A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
    }

    static boolean determination(int D) {
        int cnt = 1, last = A[1];
        for (int i = 2; i <= N; i++) {
            if (A[i] - last >= D) {
                cnt++;
                last = A[i];
            }
        }
        return cnt >= C;
    }

    static void pro() {
        int L = 0, R = 1000000000, ans = 0;
        Arrays.sort(A);
        while (L <= R) {
            int mid = (L + R) / 2;
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
