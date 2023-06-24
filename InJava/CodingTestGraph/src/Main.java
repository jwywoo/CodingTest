import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int N,M,V;
    static int[][] adj;
    static boolean[] visit;

    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        adj = new int[N+1][N+1];
        for (int i = 1; i <= M; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            // two ways
            adj[x][y] = 1;
            adj[y][x] = 1;
        }
    }

    static void dfs(int x) {
        visit[x] = true;
        sb.append(x).append(' ');
        for (int y = 1; y <= N; y++) {
            if (adj[x][y] == 0) continue;
            if (visit[y]) continue;
            dfs(y);
        }

    }

    static void bfs(int x) {
        Queue<Integer> que = new LinkedList<>();

        que.add(x);
        visit[x] = true;

        while (!que.isEmpty()) {
            x = que.poll();
            sb.append(x).append(' ');
            for (int y=1; y <= N; y++) {
                if (adj[x][y] == 0) continue;
                if (visit[y]) continue;
                que.add(y);
                visit[y] = true;
            }
        }

    }

    static void pro() {
        visit = new boolean[N+1];
        dfs(V);
        sb.append('\n');
        for (int i=1; i <= N; i++) visit[i] = false;
        bfs(V);

    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(sb.toString());
    }
}