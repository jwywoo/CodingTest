import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 3273
public class CodingTestArrayFour {
    static Scanner sc = new Scanner(System.in);
    // 9 Length (1 ~ 100000)
    // 5 12 7 10 9 1 2 3 11 Array
    // 13 X
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = sc.nextInt();
        int N = Integer.parseInt(br.readLine());
        int[] givenArray = new int[N];
        boolean[] checking = new boolean[1000001];
        String[] tempArray = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            givenArray[i] = Integer.parseInt(tempArray[i]);
        }
        int X = Integer.parseInt(br.readLine());
        int result = 0;
        // Boolean list
        for (int i = 0; i < N; i++) {
            checking[givenArray[i]] = true;
        }

        for (int i = 0; i < N; i++) {
            int valueNeeded = X - givenArray[i];
            if (valueNeeded > 0 && valueNeeded < 1000000)
                if (checking[valueNeeded]) result++;
        }

//      No need of divide result later
//        for (int i = 1; i <= (X-1)/2; i++) {
//            if (i <= 1000000 && X - i <= 1000000)
//                result += (checking[i] && checking[X-i]) ? 1:0;
//        }

//        for (int i = 0; i < N; i++) {
//            Integer temp = X - givenArray.get(i);
//            result += Collections.frequency(givenArray.subList(i, givenArray.size()), temp );
//        }

        System.out.println(result/2);
    }
}
