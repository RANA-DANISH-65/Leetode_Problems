public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetter(s.charAt(i))) i++;
            while (i < j && !Character.isLetter(s.charAt(j))) j--;
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
