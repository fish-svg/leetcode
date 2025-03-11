class Solution {
    public String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = A.length - 1;
        int j = B.length - 1;
        // 繰り上げ
        int carry_over = 0;

        while (i>=0 || j>=0 || carry_over>0) {
            // 1 - '0' = 1, 0 - '0' = 0
            int a_num = i>=0 ? A[i] - '0' : 0;
            int b_num = j>=0 ? B[j] - '0' : 0;

            int sum = a_num + b_num + carry_over;
            int digit = sum % 2;
            carry_over = sum / 2;
            i--;
            j--;

            // 1 + '0' = '1', 0 + '0' = '0'
            sb.append((char)(digit + '0'));
        }
        return sb.reverse().toString();
    }
}
