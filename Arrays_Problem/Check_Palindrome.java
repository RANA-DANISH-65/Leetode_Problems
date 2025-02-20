public class Check_Palindrome {
    public boolean checkPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int reversedNum = 0;
        int x = num;
        while (x != 0) {
            int last = num % 10;
            reversedNum = reversedNum * 10 + last;
            x /= 10;
        }

        return reversedNum == num;
    }
}
