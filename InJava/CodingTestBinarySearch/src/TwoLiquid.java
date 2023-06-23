import java.util.Arrays;

public class TwoLiquid {
    static int N, M;

    static int[] A,B;
    static void input() {

    }

    static int lowerBound(int[] A, int L, int R, int X) {
        int res = L - 1;
        while (L <= R) {
            int mid = (L+R)/2;
            if (A[mid] < X) {
                L = mid + 1;
            }
            else  {
                R = mid - 1;
            }
        }
        return res;
    }
    static void pro() {
        // Sort Target Group
        Arrays.sort(B);
        // Loop
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += lowerBound(B, 1, N+1, A[i]);
        }
    }
    public static void main(String[] args) {

    }
}
