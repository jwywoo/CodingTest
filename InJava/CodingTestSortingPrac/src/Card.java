import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Card {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static long[] sequence;

    static class Elem implements Comparable<Elem> {
        public int num;

        @Override
        public int compareTo(Elem other) {
            return num - other.num;
        }
    }

    static void input() {
        N = sc.nextInt();
        sequence = new long[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = sc.nextLong();
        }
    }

    static void pro() {
        Arrays.sort(sequence);
        long mode = sequence[0];
        int modeCnt = 1, curCnt = 1;
//        printer(sequence);
        for (int i = 1; i < sequence.length; i++) {

            if (sequence[i-1] == sequence[i]) {
                curCnt++;
            } else {
                curCnt = 1;
            }

            if (curCnt > modeCnt) {
                mode = sequence[i];
                modeCnt = curCnt;
            }
        }

        System.out.println(mode);
    }

    public static void main(String[] args) {
        input();
//        printer(sequence);
        pro();
//        printer(sequence);
    }

    static void printer(Elem[] given) {
        for (Elem e : given) {
            System.out.print(e.num + " ");
        }
        System.out.println(" ");
    }
}
