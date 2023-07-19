import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingTestBruteForceOne {
    static Scanner sc = new Scanner(System.in);

    public static boolean checker(List<Integer> givenList, int givenNum) {
        boolean result = false;
        for (int i = 0; i < givenList.size(); i++) {
            for (int j = 0; j < givenList.size(); j++) {
                for (int k = 0; k < givenList.size(); k++) {
                    if (givenNum == (givenList.get(i)+givenList.get(j)+givenList.get(k))) {
                        return true;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] givenArray = new int[N];
        for (int i = 0; i < N; i++) {
            givenArray[i] = sc.nextInt();
        }

        List<Integer> triangleList = new ArrayList<>();
        int temp = 1;
        int kValue = 0;
        // Getting K values
        while (kValue <= 1000) {
            kValue = (temp*(temp + 1))/2;
            if (kValue <= 1000) triangleList.add(kValue);
            temp++;
        }

        for (int i = 0; i < givenArray.length; i++) {
            if (checker(triangleList, givenArray[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
