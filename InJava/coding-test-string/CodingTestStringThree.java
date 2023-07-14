import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//1543
public class CodingTestStringThree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String givenSent = sc.nextLine();
        String givenWord = sc.nextLine();

        // Mine
//        int count = 0;
//        int defaultCut = 1;
//        int correctCut = givenWord.length();
//        while (givenSent.length() >= givenWord.length()) {
//            List<Integer> checkList = new ArrayList<>();
//            for (int i = 0; i < givenWord.length(); i++) {
//                if (givenSent.charAt(i) != givenWord.charAt(i)) break;
//                else checkList.add(i);
//            }
//            if (checkList.size() == givenWord.length()) {
//                givenSent = givenSent.substring(correctCut);
//                count++;
//            } else {
//                givenSent = givenSent.substring(defaultCut);
//            }
//        }
//        System.out.println(count);
        // Instructor
//        int startIndex = 0;
//        int newCount = 0;
//        while (true) {
//            int findIndex = givenSent.indexOf(givenWord, startIndex);
//            if (findIndex < 0) break;
//            startIndex = findIndex + givenWord.length();
//            newCount++;
//        }
//        System.out.println(newCount);

        // Instructor
        String replaced = givenSent.replace(givenWord,"");
        System.out.println((givenSent.length()-replaced.length())/givenWord.length());
    }
}
