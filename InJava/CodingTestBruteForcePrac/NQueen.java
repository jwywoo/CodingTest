//import java.util.Scanner;
//
//public class NQueen {
//    static int N, ans;
//    static int[] col;
//    static StringBuilder sb = new StringBuilder();
//    static void input() {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        ans = 0;
//        col = new int[N + 1];
//    }
//
//    static boolean attackable(int r1, int c1, int r2, int c2) {
//        if (c1 == c2) return true;
//        if (r1 + c1 == r2 + c2) return true;
//        if (r1 - c1 == r2 - c2) return true;
//        return false;
//
//    }
//
//    static boolean validityCheck() {
//        for (int i = 1; i <= N; i++) {
//            // 동서남북 대각선 방향으로 공격 하는지 안하는지
//            for (int j = 1; j <i; j++) {
//                if (attackable(i, col[i], j, col[j])) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    static void recBruteForce(int k) {
//        // base case
//        if (k == N+1) {
//            if (validityCheck()) {
//                ans ++;
//            }
//        }
//        // recursion
//        else {
//            for (int i = 1; i <= N; i++) {
//                col[k] = i;
//                recBruteForce(k+1);
//                col[k] = 0;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        input();
//        recBruteForce(1);
//        System.out.println(ans);
//    }
//}

import java.util.Scanner;

public class NQueen {
    static int N, ans;
    static int[] col;
    static StringBuilder sb = new StringBuilder();
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ans = 0;
        col = new int[N + 1];
    }

    static boolean attackable(int r1, int c1, int r2, int c2) {
        if (c1 == c2) return true;
        if (r1 + c1 == r2 + c2) return true;
        if (r1 - c1 == r2 - c2) return true;
        return false;

    }

    static boolean validityCheck() {
        for (int i = 1; i <= N; i++) {
            // 동서남북 대각선 방향으로 공격 하는지 안하는지
            for (int j = 1; j <i; j++) {
                if (attackable(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    static void recBruteForce(int k) {
        // base case
        if (k == N+1) {
            ans ++;
        }
        // recursion
        else {
            for (int c = 1; c <= N; c++) {
                boolean possible = true;
                for (int i=1; i <= k-1; i++) {
                    if (attackable(k,c,i,col[i])){
                        possible = false;
                    }
                }
                if (possible) {
                    col[k] = c;
                    recBruteForce(k+1);
                    col[k] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        input();
        recBruteForce(1);
        System.out.println(ans);
    }
}
