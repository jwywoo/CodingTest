import java.util.Arrays;
import java.util.Scanner;
// 10825
public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N;
    static Elem[] a;

    static class Elem implements Comparable<Elem> {
        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Elem other) {
            // 1. 국어 점수가 감소하는 순서로
            if (korean != other.korean) return other.korean - korean;
            // 2. 국어 점수가 같으면 영어 점수가 증가하는 순서로
            if (english != other.english) return english - other.english;
            // 3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
            if (math != other.math) return other.math - math;
            // 4. 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
            return name.compareTo(other.name);
        }
    }

    static void input() {
        N = sc.nextInt();
        a = new Elem[N];

        for (int i = 0; i < N; i++) {
            a[i] = new Elem();
            a[i].name = sc.next();
            a[i].korean = sc.nextInt();
            a[i].english = sc.nextInt();
            a[i].math = sc.nextInt();
        }
    }

    static void pro() {
        Arrays.sort(a);

        for (int i =0; i<a.length; i++) {
            sb.append(a[i].name).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}
