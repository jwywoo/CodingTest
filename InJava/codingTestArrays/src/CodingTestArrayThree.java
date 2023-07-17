import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CodingTestArrayThree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = sc.nextInt();
        int N = Integer.parseInt(br.readLine());
        int[] unsorted = new int[10001];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            unsorted[temp]++;
        }
        for (int i = 0; i < unsorted.length; i++) {
            // Mine
//            for (int j = 0; j < unsorted[i]; j++) {
//                System.out.println(i);
//            }
            // Not mine
            while (unsorted[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}
