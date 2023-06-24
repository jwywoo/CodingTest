import javax.sound.midi.Sequence;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int N, S;

    static int[] sequence;

    static void input() {
        N = sc.nextInt();
        S = sc.nextInt();

        sequence = new int[N+1];

        for (int i = 1; i <= N; i++) {
            sequence[i] = sc.nextInt();
        }
    }

    static void pro() {
        int R = 0, sum = 0, ans = N+1;
        for (int L = 1; L <= N; L++) {
            sum -= sequence[L-1];
            while (R + 1 <= N && sum < S) {
                R++;
                sum += sequence[R];
            }

            if (sum >= S) {
                ans = Math.min(ans, R-L + 1);
            }
        }
        if (ans == N+1) {
            ans = 0;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}