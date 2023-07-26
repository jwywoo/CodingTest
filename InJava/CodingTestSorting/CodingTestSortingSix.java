import java.util.*;

public class CodingTestSortingSix {
    static class Number implements Comparable<Number> {
        public Number(int num, int freq, int index) {
            this.num = num;
            this.freq = freq;
            this.index = index;
        }

        int num;
        int freq;
        int index;

        public int compareTo(Number o) {
            if (this.freq == o.freq) {
                return this.index - o.index;
            }
            return o.freq - this.freq;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        HashMap<Integer, Number> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (hashMap.containsKey(temp)) hashMap.get(temp).freq++;
            else hashMap.put(temp, new Number(temp, 1, i));
        }

        ArrayList<Number> sortedList = new ArrayList<>(hashMap.values());
        Collections.sort(sortedList);

        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = 0; j < sortedList.get(i).freq; j++) {
                System.out.print(sortedList.get(i).num + " ");
            }
        }
    }
}
