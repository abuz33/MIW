package controller;

public class TimeFormatter {
    public static void main(String[] args) {
        System.out.println(formatDuration(62));
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
        int last = 0;

        times[0] = seconds / (365 * 24 * 3600);
        secods = seconds % (365 * 24 * 3600);
        times[1] = secods / (24 * 3600);

        secods = seconds % (24 * 3600);
        times[2] = secods / 3600;

        secods %= 3600;
        times[3] = secods / 60;

        secods %= 60;
        times[4] = secods;

        messages[4] = times[4] + " " + (times[4] == 1 ? "second" : "seconds");
        messages[3] = times[3] + " " + (times[3] == 1 ? "minute" : "minutes");
        messages[2] = times[2] + " " + (times[2] == 1 ? "hour" : "hours");
        messages[1] = times[1] + " " + (times[1] == 1 ? "day" : "days");
        messages[0] = times[0] + " " + (times[0] == 1 ? "year" : "years");

        for (int i = 0; i < times.length; i++) {
            if (times[i] != 0) {
                numberOfIncludes++;
                includes[i] = true;
                if (last < i) last = i;
            }
        }


        if (numberOfIncludes == 1) {
            message = messages[last];
        } else {
            for (int i = 0; i < messages.length; i++) {
                if (includes[i]) {
                    if (i == last) message += " and " + messages[i];
                    else if (numberOfIncludes == 2) message += messages[i];
                    else message += messages[i] + ", ";
                    numberOfIncludes--;
                }
            }
        }

        return message;
    }
}
