class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == needle.length()) {
            if (haystack.equals(needle)) return 0;
            else return -1;
        }
        for (int i=0; i<haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
