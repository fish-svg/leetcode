class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> brackets = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        for (char c : s.toCharArray()) {

            if (brackets.containsValue(c)) {
                stack.push(c);
            }
            else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
