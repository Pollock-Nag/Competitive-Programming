package toph;

import java.util.*;

/**
 *
 * @author Pollock
 */
public class ClockMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int mins = sc.nextInt();
     
        System.out.printf("%.7f", angle(hour, mins));

    }

    public static double angle(int hour, int minute) {
        if (hour < 0 || minute < 0) {
            return -1;
        }
        if (hour == 12) {
            hour = 0;
        }
        if (minute == 60) {
            minute = 0;
            hour += 1;
        }
        double hourAngle = (hour * 60 + minute) * 0.5;
        double minAngle = minute * 6;
        double bwAngle = Math.abs(hourAngle - minAngle);
        return Math.min(360 - bwAngle, bwAngle);

    }

}
