public class HappyNumber {
    public boolean isHappy(int n){
        int slow=getSquare(n);
        int fast=getSquare(getSquare(n));
        while(slow!=fast){
            if(slow==1||fast==1)return true;
            slow=getSquare(slow);
            fast=getSquare(getSquare(fast));
        }
        return slow==1;
    }
    private int getSquare(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last * last;
            n /= 10;
        }
        return sum;
    }
}
