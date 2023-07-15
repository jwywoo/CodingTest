import java.util.Scanner;
// 10158
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] widthHeight = sc.nextLine().split(" ");
        String[] startingPosition = sc.nextLine().split(" ");
        int times = Integer.parseInt(sc.nextLine());

        int[] whList = new int[2];
        int[] current = new int[2];
        int widthMove = 1;
        int heightMove = 1;

        // Width and height
        whList[0] = Integer.parseInt(widthHeight[0]);
        whList[1] = Integer.parseInt(widthHeight[1]);
        times = times%(whList[0]*whList[1]);
        // Starting Position
        current[0] = Integer.parseInt(startingPosition[0]);
        current[1] = Integer.parseInt(startingPosition[1]);

//        current[0] = (times + current[0]) % (2*whList[0]);
//        current[1] = (times + current[1]) % (2*whList[1]);
//
//        if (current[0] > whList[0]) current[0] = 2*whList[0] - current[0];
//        if (current[1] > whList[1]) current[1] = 2*whList[1] - current[1];

        // Time error
        for (int i = 0; i < times; i++) {
            // width check
            if (current[0] + widthMove > whList[0]) {
                widthMove = -1;
            }
            if (current[0] + widthMove < 0) {
                widthMove = 1;
            }
            // height check
            if (current[1] + heightMove > whList[1]) {
                heightMove = -1;
            }
            if (current[1] + heightMove < 0) {
                heightMove = 1;
            }
            current[0] += widthMove;
            current[1] += heightMove;
        }
        System.out.println(current[0] + " " + current[1]);
    }
}