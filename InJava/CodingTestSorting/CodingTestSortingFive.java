import java.io.*;
import java.util.*;

// 18870
public class CodingTestSortingFive {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] result = new int[N];
        HashMap<Integer, Integer> sortedMap = new HashMap<>();
//        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
//            int num = sc.nextInt();
            int num = Integer.parseInt(inputs[i]);
            result[i] = num;
//            hashSet.add(num);
            treeSet.add(num);
        }
        int index = 0;
        for (int x: treeSet) sortedMap.put(x,index++);
        for (int i = 0; i < result.length; i++) bw.write(sortedMap.get(result[i]) + " ");
//        for (int i = 0; i < result.length; i++) System.out.print(sortedMap.get(result[i]) + " ");
        bw.flush();
    }
}
