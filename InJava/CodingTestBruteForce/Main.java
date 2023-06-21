// import java.util.Scanner;
// 15651
//public class Main {
//    static int N;
//    static int M;
//    static int[] selected;
//
//    static StringBuilder sb = new StringBuilder();
//
//    static void input() {
//        Scanner sc= new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();
//
//        selected = new int[M+1];
//    }
//
//    static void rec_func(int k) {
//        // When to stop
//        if (k == M+1) {
//            for (int i = 1; i <= M; i++) {
//                sb.append(selected[i]).append(' ');
//            }
//            sb.append('\n');
//        // Executing the recursion
//        // cand 1 2 3 4 5
//        // if k = 1
//        //
//        } else {
//            for (int cand = 1; cand <= N; cand++) {
//                selected[k] = cand;
//                rec_func(k+1);
//                selected[k] = 0;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        input();
//        rec_func(1);
//        System.out.println(sb.toString());
//    }
//}


// 15694
//public class Main {
//    static int N;
//    static int M;
//    static int[] selected;
//    static int[] used;
//    static StringBuilder sb = new StringBuilder();
//
//    static void input() {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();
//
//        selected = new int[M+1];
//        used = new int[N+1];
//    }
//
//    static void recursiveSol(int k) {
//        // base case
//        if (k == M + 1) {
//            for (int i = 1; i <= M; i++) {
//                sb.append(selected[i]).append(' ');
//            }
//            sb.append('\n');
//         }
//        // recursion
//        else {
//            for (int cand = 1; cand <= N; cand++) {
//                if (used[cand] == 1) continue;
//                selected[k] = cand;
//                used[cand] = 1;
//
//                recursiveSol(k + 1);
//
//                selected[k] = 0;
//                used[cand] = 0;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        input();
//        recursiveSol(1);
//
//        System.out.println(sb.toString());
//    }
//}

// 15652
//public class Main {
//    static int N;
//    static int M;
//    static int[] selected;
//
//    static StringBuilder sb = new StringBuilder();
//
//    static void input() {
//        Scanner sc = new Scanner(System.in);
//
//        N = sc.nextInt();
//        M = sc.nextInt();
//
//        selected = new int[M + 1];
//    }
//
//    static void recursiveSol(int k) {
//        // base case
//        if (k == M + 1) {
//            for (int i = 1; i <= M; i++) {
//                sb.append(selected[i]).append(' ');
//            }
//            sb.append('\n');
//        }
//        // recursion
//        else {
//            int start = selected[k - 1];
//            if (start == 0) start = 1;
//            for (int i = start; i <= N; i++) {
//                selected[k] = i;
//                recursiveSol(k + 1);
//                selected[k] = 0;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        input();
//        recursiveSol(1);
//
//        System.out.println(sb.toString());
//    }
//}
import java.util.Scanner;
