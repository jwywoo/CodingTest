import java.util.Scanner;

// 1730
public class CodingTestBruteForceSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String command = sc.hasNext() ? sc.next() : "";

        boolean[][] passVertical = new boolean[N][N];
        boolean[][] passHorizontal = new boolean[N][N];

        int curR = 0, curC = 0;
        for (int i = 0; i < command.length(); i++) {
            char cmd = command.charAt(i);
            if (cmd == 'D') {
                if (curR == N - 1) continue;;
                passVertical[curR][curC] = passVertical[curR + 1][curC] = true;
                curR++;
            }
            else if (cmd == 'U') {
                if (curR == 0) continue;
                passVertical[curR][curC] = passVertical[curR - 1][curC] = true;
                curR--;
            }
            else if (cmd == 'L') {
                if (curC == 0) continue;;
                passHorizontal[curR][curC] = passHorizontal[curR][curC - 1] = true;
                curC--;
            }
            else {
                if (curC == N - 1) continue;;
                passHorizontal[curR][curC] = passHorizontal[curR][curC + 1] = true;
                curC++;
            }
        }

        for (int i = 0; i < N; i++) {
            String ans = "";
            for (int j = 0; j < N; j++) {
                if (passHorizontal[i][j] && passVertical[i][j]) ans += "+";
                else if (passVertical[i][j]) ans += "|";
                else if (passHorizontal[i][j]) ans += "-";
                else ans += ".";
            }
            System.out.println(ans);
        }
    }
// Not working
//    public static boolean checker(int N, int x, int y) {
//        if (x < N && y < N && x >= 0 && y >= 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void draw(int[][] grid, int x, int y, int pattern) {
//        if (grid[x][y] == 46) {
//            grid[x][y] = pattern;
//        }
//        if (grid[x][y] == 124 && pattern == 45) {
//            grid[x][y] = 43;
//        }
//        if (grid[x][y] == 45 && pattern == 124) {
//            grid[x][y] = 43;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String orders = sc.next();
//        int[][] grid = new int[N][N];
//        int startX = 0;
//        int startY = 0;
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                grid[i][j] = 46;
//            }
//        }
//
//        for (int i = 0; i < orders.length(); i++) {
//            int movX = 0;
//            int movY = 0;
//            int pattern = 0;
//            if (orders.charAt(i) == 'D') {
//                movX = 1;
//                movY = 0;
//                pattern = 124;
//            }
//            if (orders.charAt(i) == 'U') {
//                movX = -1;
//                movY = 0;
//                pattern = 124;
//            }
//            if (orders.charAt(i) == 'R') {
//                movX = 0;
//                movY = 1;
//                pattern = 45;
//            }
//            if (orders.charAt(i) == 'L') {
//                movX = 0;
//                movY = -1;
//                pattern = 45;
//            }
//            // Draw Start
//            if (checker(N, startX + movX, startY + movY)) {
//                draw(grid, startX, startY, pattern);
//                // Draw End
//                draw(grid, startX + movX, startY + movY, pattern);
//                startX += movX;
//                startY += movY;
//            }
//        }
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print((char) grid[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
}
