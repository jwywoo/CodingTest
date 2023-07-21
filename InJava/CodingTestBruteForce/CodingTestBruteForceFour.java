import java.util.Scanner;
// 3085
public class CodingTestBruteForceFour {

    public static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char temp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = temp;
    }

    public static int maxRow(char[][] map) {
        int N = map.length;
        int curMax = 0;
        for (int r = 0; r < N; r++) {
            int len = 1;
            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) len++;
                else {
                    curMax = Math.max(curMax, len);
                    len = 1;
                }
            }
            curMax = Math.max(curMax, len);
        }
        return curMax;
    }

    public static int maxColumn(char[][] map) {
        int N = map.length;
        int curMax = 0;
        for (int c = 0; c < N; c++) {
            int len = 1;
            for (int r = 1; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) len++;
                else {
                    curMax = Math.max(curMax, len);
                    len = 1;
                }
            }
            curMax = Math.max(curMax, len);
        }
        return curMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }


        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    swapCandy(map, i, j, i, j + 1);
                    ans = Math.max(ans, Math.max(maxColumn(map), maxRow(map)));
                    swapCandy(map, i, j, i, j + 1);
                }
                if (i + 1 < N) {
                    swapCandy(map, i, j, i + 1, j);
                    ans = Math.max(ans, Math.max(maxColumn(map), maxRow(map)));
                    swapCandy(map, i, j, i + 1, j);
                }
            }
        }
        System.out.println(ans);
    }
}
