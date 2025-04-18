class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        if (rowIndex == 0) {
            List<Integer> zero = new ArrayList<>();
            zero.add(1);
            return zero;
        }
        for (int i=0; i<=rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j==0 || j==i) {
                    row.add(1);
                }
                else {
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return ans.get(rowIndex);
    }
}
