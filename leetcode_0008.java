class Solution {

    public int[] plusOne(int[] digits) {
        for (int i=digits.length - 1; i>=0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] new_digits = new int[digits.length + 1];
        new_digits[0] = 1;
        return new_digits;
    }
}
