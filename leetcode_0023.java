class Solution {

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry: map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int temp = map.get(nums[i]);
                temp++;
                map.put(nums[i], temp);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for (int n : map.values()) {
            if (n == 1) return getKey(map, n);
        }
        return 0;
    }
}
