class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -101;
        for (int num : nums) {
            if (num >= 0) {
                set.add(num);
            }
            if (num < 0) {
                ans = Math.max(ans, num);
            }
        }
        if (set.isEmpty()) return ans;
        int sum = 0;
        for (int key : set) sum += key;
        return sum;
    }
}
