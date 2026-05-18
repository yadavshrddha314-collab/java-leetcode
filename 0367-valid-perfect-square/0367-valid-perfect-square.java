class Solution {
    public boolean isPerfectSquare(int num) {
int low= 1;
int high = num;
 while (low <= high) {
            int mid = low + (high - low) / 2;
            long ans = (long) mid * mid;

            if (ans == num) return true;
            else if (ans < num) low = mid + 1;
            else high = mid - 1;
}
return false;
    }
}