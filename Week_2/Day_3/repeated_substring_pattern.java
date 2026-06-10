package Week_2.Day_3;

public class repeated_substring_pattern {
    public boolean repeatedSubstringPattern(String s) {
        String d = s + s;
        return d.substring(1, d.length() - 1).contains(s);
    }
}