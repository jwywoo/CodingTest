import java.util.Scanner;

public class PartialSum {
    static int N, ans,S;
    static int[] sequence;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();

        sequence = new int[N+1];


        for (int i = 1; i < N+1; i++) sequence[i] = sc.nextInt();

    }

    static void recBruteForce(int k,int value) {
        // Base Case
        // When sum of sequence is equal to given S
        if (k == N+1) {
            if (value == S) ans ++;
        }
        // Recursion
        else {
            recBruteForce(k+1, value + sequence[k]);
            recBruteForce(k+1, value);
        }
    }

    public static void main(String[] args) {
        input();
        recBruteForce(1, 0);
        if (S == 0) ans--;
        System.out.println(ans);
    }
}
