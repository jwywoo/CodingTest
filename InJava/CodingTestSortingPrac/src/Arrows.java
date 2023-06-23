import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrows {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static ArrayList<Integer>[] a;
    static void input() {
        N = sc.nextInt();
        a = new ArrayList[N + 1];
        for (int color = 1; color <= N; color++) {
            a[color] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= N; i++) {
            int coord, color;
            coord = sc.nextInt();
            color = sc.nextInt();
            a[color].add(coord);
        }
    }

    static class Elem implements Comparable<Elem> {
        @Override
        public int compareTo(Elem other) {
            return 0;
        }
    }

    static int toLeft(int color, int idx) {
        if (idx == 0 ) return Integer.MAX_VALUE;
        return a[color].get(idx) - a[color].get(idx - 1);
    }

    static int toRight(int color, int idx) {
        if (idx + 1== a[color].size()) return Integer.MAX_VALUE;
        return a[color].get(idx + 1)-a[color].get(idx);
    }

    static void pro() {
        for (int color = 1; color <= N; color++) {
            Collections.sort(a[color]);
        }

        int ans = 0;
        for (int color = 1; color <= N; color++) {
            for (int i = 0; i < a[color].size(); i++) {
                int left = toLeft(color,i);
                int right = toRight(color, i);

                ans += Math.min(left,right);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}
