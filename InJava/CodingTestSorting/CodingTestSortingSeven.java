import java.util.Arrays;
import java.util.Scanner;

public class CodingTestSortingSeven {
    static class Meeting implements Comparable<Meeting>{
        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        int start;
        int end;

        public int compareTo(Meeting o) {
            if (this.end == o.end) return this.start - o.start;
            return this.end - o.end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(meetings);
//        for (int i = 0; i < N; i++) {
//            System.out.println(meetings[i].start + " " + meetings[i].end);
//        }

        int count = 0, ended = 0;
        for (int i = 0; i < N; i++)
            if (ended <= meetings[i].start) {
                count++;
                ended = meetings[i].end;
            }

        System.out.println(count);
    }
}
