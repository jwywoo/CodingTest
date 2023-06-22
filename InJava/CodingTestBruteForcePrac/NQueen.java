import java.util.Scanner;

public class NQueen {
    static int N,M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        selected = new int[M + 1];
    }


    static void recBruteForce(int k) {
        // base case
        if (k == M+1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        // recursion
        else {
            for (int i = 1; i <= N; i++) {
                selected[k] = i;
                recBruteForce(k+1);
                selected[k] = 0;
            }
        }
    }
    public static void main(String[] args) {
        input();
        recBruteForce(1);
        System.out.println(sb.toString());
    }
}
