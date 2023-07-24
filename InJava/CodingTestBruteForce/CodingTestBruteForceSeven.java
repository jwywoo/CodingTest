import java.util.Scanner;

public class CodingTestBruteForceSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");

        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);

        String[] board = new String[N];
        int[] checker = new int[25];

        int current = board.length;
        int boardSize = board.length;
        String ans = "";
        for (int i = 0; i < K; i++) {
            String[] given = sc.nextLine().split(" ");
            int passed = Integer.parseInt(given[0]);
            String value = given[1];
            int checking = (int) value.charAt(0)-65;
            checker[checking] += 1;
            current -= passed;
            if (current < 0) {
                current += boardSize;
            }
            if (board[current] == null) {
                if (checker[checking] > 1) {
                    ans += "!";
                    break;
                }
                board[current] = value;
            }
            else if (!(board[current].equals(value))) {
                ans += "!";
                break;
            }
        }



        if (ans.length() != 0) {
            System.out.println("!");
        } else {
            int count = 0;
            while (count != boardSize) {
                if (board[current] == null) {
                    System.out.print("?");
                } else {
                    System.out.print(board[current]);
                }
                current++;
                if (current == boardSize) {
                    current = 0;
                }
                count++;
            }
        }
    }
}
