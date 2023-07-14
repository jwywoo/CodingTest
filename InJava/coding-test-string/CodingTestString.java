import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections.*;

public class CodingTestString {
    static Scanner sc = new Scanner(System.in);
    static String firstSent, secondSent;
    static int[] firstDict = new int[26];
    static int[] secondDict = new int[26];

    static void input() {
        firstSent = sc.next();
        secondSent = sc.next();
    }

    static void counter(int[] given, String sent) {
        for (int i = 0; i < sent.length(); i++) {
            given[sent.charAt(i)-'a']++;
        }
    }

    static void pro() {
        int answer = 0;

        counter(firstDict,firstSent);
        counter(secondDict, secondSent);

        for (int i = 0; i < firstDict.length;i++){
            answer += Math.abs(firstDict[i] - secondDict[i]);

        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        input();
        pro();
//        System.out.println(firstSent);
//        System.out.println(secondSent);
    }
}
