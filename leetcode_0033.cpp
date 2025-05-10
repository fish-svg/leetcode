class Solution {
public:
    int hammingWeight(int n) {
        bitset<60> bs(n);
        int ans = 0;
        for (int i=0; i<60; i++) {
            if (bs.test(i)) ans++;
        }
        return ans;
    }
};
