import java.util.*;

class Solution {
    public String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && !stack.isEmpty()) {
                stack.pollLast();
            } else if (!Character.isDigit(c)) {
                stack.addLast(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pollFirst());
        }

        return result.toString();
    }
}
