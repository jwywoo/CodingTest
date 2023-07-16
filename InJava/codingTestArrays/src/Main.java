import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1236
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int counter(int[] givenList) {
        int result = 0;
        for (int i = 0; i < givenList.length; i++) {
            if (givenList[i] == 0) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String rowCol = sc.nextLine();
        int row = Integer.parseInt(rowCol.split(" ")[0]);
        int col = Integer.parseInt(rowCol.split(" ")[1]);
        char[][] map = new char[row][col];

        for (int i = 0; i < row; i++) {
            map[i] = sc.next().toCharArray();
        }

        int[] rowList = new int[row];
        int[] colList = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (map[i][j] == 'X') {
                    rowList[i] += 1;
                    colList[j] += 1;
                }
            }
        }
        int newRow = counter(rowList);
        int newCol = counter(colList);

        System.out.println(Math.max(newRow, newCol));
    }
}