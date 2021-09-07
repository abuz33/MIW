package controller;

public class TimeFormatter {
    public static void main(String[] args) {
        System.out.println(formatDuration(369121517));
    }

    public static String formatDuration(int seconds) {
        // your code goes here
        if (seconds == 0) return "now";
        int numberOfIncludes = 0;
        int[] times = new int[5];
        boolean[] includes = new boolean[5];
        String[] messages = new String[5];
        String message = "";
        int secods;

        int year = seconds / (365 * 24 * 3600);
        secods = seconds % (365 * 24 * 3600);
        int day = secods / (24 * 3600);

        secods = seconds % (24 * 3600);
        int hour = secods / 3600;

        secods %= 3600;
        int minutes = secods / 60 ;

        secods %= 60;
        int secons = secods;

        System.out.printf("%s year, %s day, %s hour, %s minutes, %s second", year, day, hour,minutes,secons);


        times[0] = seconds % 60;
        times[1] = seconds / 60;
        times[2] = times[1] / 60;
        times[3] = times[2] / 24;
        times[4] = times[3] / 365;
        for (int i = 0; i < times.length; i++) {
            if (times[i] != 0) {
                numberOfIncludes++;
                includes[i] = true;
            }

        }

        messages[0] = times[0] + " " + (times[0] == 1 ? "second" : "seconds");
        messages[1] = times[1] + " " + (times[1] == 1 ? "minute" : "minutes");
        messages[2] = times[2] + " " + (times[2] == 1 ? "hour" : "hours");
        messages[3] = times[3] + " " + (times[3] == 1 ? "day" : "days");
        messages[4] = times[4] + " " + (times[4] == 1 ? "year" : "years");

        for (int i = times.length -1; i > 0; i--) {
            if (i ==0 ) message +=" and " + messages[i];
            else message += times[i] + ", ";
        }

        System.out.println(message);

        return message;
    }
}
