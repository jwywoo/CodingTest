import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodingTestBruteForceSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);

        String[] board = new String[N];
        Arrays.fill(board, "?");
        String[] letterList = new String[K];
        int[] passedList = new int[K];
        for (int i = 0; i < K; i++) {
            temp = sc.nextLine().split(" ");
            letterList[i] = temp[1];
            passedList[i] = Integer.parseInt(temp[0]);
        }

        int i = letterList.length;
        int curIndex = 0;
        String ans = "";
        while (i-- > 0) {
            String letter = letterList[i];
            if (!(board[curIndex].equals("?"))) {
                if (!(board[curIndex].equals(letter))) {
                    ans = "!";
                    break;
                }
            }
            board[curIndex] = letter;
            curIndex += passedList[i];
            if (curIndex >= board.length) curIndex -= board.length;
        }

        if (i < 0) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[j]);
            }
        } else {
            System.out.println(ans);
        }

    }
    // Only pass test example fuck
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] temp = sc.nextLine().split(" ");
//
//        int N = Integer.parseInt(temp[0]);
//        int K = Integer.parseInt(temp[1]);
//
//        String[] board = new String[N];
//        int current = board.length;
//        int boardSize = board.length;
//        String ans = "";
//        for (int i = 0; i < K; i++) {
//            String[] given = sc.nextLine().split(" ");
//            int passed = Integer.parseInt(given[0]);
//            String value = given[1];
//            current -= passed;
//            if (current < 0) {
//                current += boardSize;
//            }
//            if (board[current] == null) {
//                for (int j = 0; j < boardSize; j++) {
//                    if (board[j] == null || j == current) continue;
//                    if (board[j].equals(value)) ans+="!";
//                }
//                board[current] = value;
//            }
//            else if (!(board[current].equals(value))) {
//                ans += "!";
//            }
//            if (ans.equals("!")) break;
//        }
//
//        if (ans.length() != 0) {
//            System.out.println("!");
//        } else {
//            for (int i = 0; i < boardSize; i++) {
//                int index = i%boardSize;
//                if (board[current] == null) {
//                    System.out.print("?");
//                } else {
//                    System.out.print(board[current]);
//                }
//                current++;
//                if (current >= boardSize) {
//                    current = 0;
//                }
//            }
//        }
//    }
}
