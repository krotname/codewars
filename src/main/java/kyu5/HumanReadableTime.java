package kyu5;

public class HumanReadableTime {
    //5 https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
    /*Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.

*/
    public static void main(String[] args) {
        System.out.println(HumanReadableTime.makeReadable(359999));
        System.out.println(HumanReadableTime.makeReadable(86399));
        System.out.println(HumanReadableTime.makeReadable(5));
        System.out.println(HumanReadableTime.makeReadable(0));
    }

    public static String makeReadable(int seconds) {
        if (seconds > 359999) {
            return "error: very long";
        }
        int HH = 0;
        int MM = 0;
        int SS = 0;

        final int KOEF_MM = 60;
        final int KOEF_HH = 60 * 60;

        HH = seconds / KOEF_HH;
        seconds = seconds % KOEF_HH;
        MM = seconds / KOEF_MM;
        SS = seconds % KOEF_MM;

        return addZero(HH) + ":" + addZero(MM) + ":" + addZero(SS);
    }

    public static String addZero(int i) {
        if (i > 9 || i < 0) {
            return "" + i;
        } else {
            return "0" + i;
        }
    }
}