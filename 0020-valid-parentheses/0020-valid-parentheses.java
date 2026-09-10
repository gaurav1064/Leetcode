class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if (map.containsValue(ch)) {
                stack.add(ch);
            } else {
                if (stack.empty()) return false;
                if (stack.peek() != map.get(ch)) return false;
                else stack.pop();
            }
        }

        if (!stack.isEmpty()) return false;

        return true;
    }
}