import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] A;
    static int[] count;


    static void input() {
        N = sc.nextInt();
        A = new int[N+1];
        count = new int[100000+1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
    }

    static void pro() {
        long ans = 0;

        for (int L = 1, R=0; L<=N; L++) {
            while (R + 1 <= N && count[A[R+1]] == 0) {
                R++;
                count[A[R]]++;
            }
            ans += R-L+1;
            count[A[L]] --;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}