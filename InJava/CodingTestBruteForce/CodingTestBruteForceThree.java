import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 11068
public class CodingTestBruteForceThree {
    // Better version

    public static ArrayList<Integer> convertBase(int x, int i) {
        ArrayList<Integer> result = new ArrayList<>();
        while (x > 0) {
            result.add(x%i);
            x /= i;
        }
        return result;
    }

    public static boolean checker(ArrayList<Integer> digit) {
        for (int i = 0; i < digit.size()/2; i++) {
            if (!(digit.get(i).equals(digit.get(digit.size() - 1 - i)))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] givenList = new int[T];
        for (int i = 0; i < T; i++) {
            givenList[i] = sc.nextInt();
        }

        for (int i = 0; i < givenList.length; i++) {
            boolean result = false;
            for (int j = 2; j <= 64; j++) {
                ArrayList<Integer> digit = convertBase(givenList[i], j);
                if (checker(digit)) {
                    result = true;
                    break;
                }
            }
            System.out.println(result ? "1" : "0");
        }
    }

//    public static String converter(String giveNum, int digit) {
//        String result = "";
//        int before = Integer.parseInt(giveNum);
//        List<Integer> tempList = new ArrayList<>();
//        while (before >= 1) {
//            tempList.add(before%digit);
//            before /= digit;
//        }
//        for (int i = tempList.size(); i-- > 0;) {
//            if (tempList.get(i) > 9) {
//                result += (char) ('A' + (tempList.get(i) - 10));
//
//            } else {
//                result +=  tempList.get(i);
//            }
//        }
//        System.out.println(result);
//        return result;
//    }
//
//    public static boolean checker(String givenNum) {
////        String converted = converter(givenNum);
//        int tempIndex  = givenNum.length() - 1;
//        boolean tempResult = false;
//        for (int i = 0; i < givenNum.length(); i++) {
//            if (givenNum.charAt(i) == givenNum.charAt(tempIndex)) tempResult = true;
//            else {
//                tempResult = false;
//                break;
//            }
//            tempIndex--;
//        }
//        if (tempResult) return true;
////        System.out.println("here");
//
//        for (int i = 2; i < 36; i++) {
//            String converted = converter(givenNum, i);
//            boolean result = false;
//            int givenSize = converted.length() - 1;
//            for (int j = 0; i < converted.length(); i++) {
//                if (converted.charAt(j) == converted.charAt(givenSize)) result = true;
//                else {
//                    result = false;
//                    break;
//                }
//                givenSize--;
//            }
//            if (result) return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        N = sc.nextInt();
//        givenList = new String[N];
//        for (int i = 0; i < N; i++) {
//            givenList[i] = sc.next();
//        }
//        for (int i = 0; i < givenList.length; i++) {
//            if (checker(givenList[i])) System.out.println(1);
//            else System.out.println(0);
//        }
//    }
}
