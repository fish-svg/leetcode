class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if ((long)mid*mid > (long)x) {
                right = mid - 1;
            }
            else if ((long)mid*mid == (long)x) {
                return mid;
            }
            else {
                left = mid + 1;
            }
        }

        return Math.round(right);
    }
}
