import java.util.Scanner;

// 13223
public class CodingTestStringFour {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String timeNow = sc.nextLine();
        String timeDue = sc.nextLine();
        String[] timeNowList = timeNow.split(":");
        String[] timeDueList = timeDue.split(":");

        // timeNowList -> hour, min, sec
        int nowHour = Integer.parseInt(timeNowList[0]);
        int nowMin = Integer.parseInt(timeNowList[1]);
        int nowSec = Integer.parseInt(timeNowList[2]);
        // timeDueList -> hour, min, sec
        int dueHour = Integer.parseInt(timeDueList[0]);
        int dueMin = Integer.parseInt(timeDueList[1]);
        int dueSec = Integer.parseInt(timeDueList[2]);
        // timeResult -> hour, min, sec
        int resultHour = 0;
        int resultMin = 0;
        int resultSec = 0;

//        int totalNowSec = nowHour * 3600 + nowMin * 60 + nowSec;
//        int totalDueSec = dueHour * 3600 + dueMin * 60 + dueSec;
//        int totalResultSec = totalDueSec - totalNowSec;
//
//        if (totalResultSec <= 0) totalResultSec += 24 * 3600;
//
//        resultHour = totalResultSec / 3600;
//        resultMin = (totalResultSec % 3600) / 60;
//        resultSec = (totalResultSec) % 60;

        boolean stop = true;
        if (nowHour==dueHour && nowMin == dueMin && nowSec == dueSec) {
            resultHour = 24;
            resultMin = 00;
            resultSec = 00;
            stop = false;
        }
        // Hard coding
        while (stop) {
            // due
            if (nowSec == 60) {
                nowSec = 0;
                nowMin++;
            }
            if (nowMin == 60) {
                nowMin = 0;
                nowHour++;
            }
            if (nowHour == 24) {
                nowHour = 0;
            }
            // result
            if (resultSec == 60) {
                resultSec = 0;
                resultMin++;
            }
            if (resultMin == 60) {
                resultMin = 0;
                resultHour++;
            }
            if (nowHour==dueHour && nowMin == dueMin && nowSec == dueSec) break;
            nowSec++;
            resultSec++;
        }
////        System.out.println(resultHour+":"+resultMin+":"+resultSec);
        System.out.println(String.format("%02d:%02d:%02d", resultHour, resultMin, resultSec));
    }
}
