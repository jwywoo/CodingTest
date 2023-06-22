import java.util.Scanner;

public class Main {
    static int N, max, min;
    static int[] nums, operators, order;
    static StringBuilder sb = new StringBuilder();

    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nums = new int[N+1];
        operators = new int[5];
        order = new int[N+1];

        for (int i = 1; i <= N; i++) nums[i] = sc.nextInt();
        for (int i = 1; i <= 4; i++) operators[i] = sc.nextInt();

        // Answers
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int calculator() {
        int value = nums[1];
        for (int i=1; i <= N; i++) {
            // +
            if (order[i] == 1) value = value + nums[i+1];
            // -
            if (order[i] == 2) value = value - nums[i+1];
            // *
            if (order[i] == 3) value = value * nums[i+1];
            // /
            if (order[i] == 4) value = value / nums[i+1];
        }
        return value;
    }

    static void recursiveSol(int k){
        if (k == N) {
            int value = calculator();
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for (int cand = 1; cand <= 4; cand++) {
                if (operators[cand] >= 1) {
                    operators[cand]--;
                    order[k] = cand;
                    recursiveSol(k+1);
                    operators[cand]++;
                    order[k] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        recursiveSol(1);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }
}
