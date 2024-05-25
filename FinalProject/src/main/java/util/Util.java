package util;

public class Util {
    /**
     * converts each word in a string to title case
     * @param strIn input String
     * @return the string in title case
     */
    public static String toTitleCase(String strIn) {
        String[] strs = strIn.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > 0) {
                strs[i] = strs[i].substring(0, 1).toUpperCase() + strs[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", strs);
    }
}
