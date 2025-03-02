class Solution {
    public int removeDuplicates(int[] nums) {

        int ans = 1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[ans-1]) {
                continue;
            }
            else {
                nums[ans] = nums[i];
                ans++;
            }
        }
        
        return ans;
    }
}
