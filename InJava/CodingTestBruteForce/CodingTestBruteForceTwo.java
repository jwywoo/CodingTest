import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 11005
public class CodingTestBruteForceTwo {
    static Scanner sc = new Scanner(System.in);
    static List<Integer> result = new ArrayList<>();

    public static void converter(int givenNum) {
        if (givenNum > 9) {
            givenNum -= 10;
            System.out.print((char) ('A' + givenNum));
        } else {
            System.out.print(givenNum);
        }
    }
    public static void main(String[] args) {
        String[] given = sc.nextLine().split(" ");
        int N = Integer.parseInt(given[0]);
        int B = Integer.parseInt(given[1]);
        // dividing
        while (N >= 1) {
            result.add(N%B);
            N /= B;
        }
        System.out.println(result.size());
        // printing
        for (int i = result.size(); i-- > 0;) {
            converter(result.get(i));
        }
    }
}
