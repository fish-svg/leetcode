class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t ans = 0;
        for (int i=0; i<32; i++) {
            // n 左シフト
            ans <<= 1;
            // n の末尾を取得し，or でans に加える
            ans = ans | (n&1);
            // n 右シフト
            n >>= 1;
        }
        return ans;
    }
};
