import java.util.Scanner;
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


