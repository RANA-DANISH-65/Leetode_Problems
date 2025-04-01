public class ReverseWordsInString {

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') end--;
            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') start--;

            if (!res.isEmpty()) res.append(' ');
            res.append(s, start + 1, end + 1);
            end = start - 1;

        }
        return res.toString();
    }
}
