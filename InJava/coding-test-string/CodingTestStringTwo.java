import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 1157
public class CodingTestStringTwo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //String input = sc.next();
        String input = sc.next().toUpperCase();
        int[] inputDict = new int[26];

        char answer = '?';

        // Creating Dict
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) < 'a') {
//                inputDict[input.charAt(i) - 'A']++;
//            } else {
//                inputDict[input.charAt(i) - 'a']++;
//            }
//        }
        for (int i = 0; i < input.length(); i++) {
            inputDict[input.charAt(i) - 'A'] ++;
        }

        // Checking
//        int maxNum = 0;
//        List<Integer> listNum = new ArrayList<>();
//        for (int i = 0; i < inputDict.length; i++) {
//            if (maxNum < inputDict[i]) {
//                listNum.clear();
//                listNum.add(i);
//                maxNum = inputDict[i];
//            } else if (maxNum == inputDict[i]) {
//                listNum.add(i);
//            }
//        }
//        if (listNum.size() > 1) {
//            System.out.println("?");
//        } else {
//            System.out.println((char) (listNum.get(0) + 'A'));
//        }

        // 선생님 풀이
        int maxCount = -1;
        char maxLetter = '?';
        for (int i = 0; i < inputDict.length; i++) {
            if (inputDict[i] > maxCount) {
                maxCount = inputDict[i];
                maxLetter = (char) ('A' + i);
            } else if (maxCount == inputDict[i]) {
                maxLetter = '?';
            }
        }

        System.out.println(maxLetter);
    }
}
