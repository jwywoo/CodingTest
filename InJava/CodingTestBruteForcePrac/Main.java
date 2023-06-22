import java.util.Scanner;

public class Main {
//    static int N;
//    static int[] M;
//    static int[] arithmetic;
    static int N;
    static int M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
//        String temp = sc.next();
//        String tempTwo = sc.next();
//
//        for (int i = 0; i < N; i++) {
//
//        }
//
//        for (int i = 0; i < 4; i++) {
//
//        }
        selected = new int[M+1];
    }

    static void recursiveSol(int k){
        if (k == M+1) {
//            for (int i = 1; i <= M.length; i++) {
//                sb.append(arithmetic[i]).append(' ');
//            }
            for (int i = 1; i <= M; i++){
                sb.append(selected[i]).append(' ');
            }
            sb.append("\n");
        } else {
//            for (int i = 1; i <= arithmetic.length; i++ ) {
//                selected[k] = i;
//                recursiveSol(k+1);
//                selected[k] = 0;
//            }
            for (int i = 1; i <= N; i++) {
                selected[k] = i;
                recursiveSol(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        recursiveSol(1);
        System.out.println(sb.toString());
    }
}
