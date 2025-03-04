class Solution {
    public List<String> letterCombinations(final String digits) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("2", "abc");
        mapping.put("3", "def");
        mapping.put("4", "ghi");
        mapping.put("5", "jkl");
        mapping.put("6", "mno");
        mapping.put("7", "pqrs");
        mapping.put("8", "tuv");
        mapping.put("9", "wxyz");
        List<String> result = new ArrayList<>();

        if(digits.length() > 0)
            backtrack(result, new StringBuilder(), mapping, digits, 0);

        return result;
    }

    private void backtrack(List<String> result,StringBuilder sb,Map<String, String> mapping,String digits, int idx) {
        if(idx == digits.length()) {
            result.add(sb.toString());
            return;
        }
        String values = mapping.get(String.valueOf(digits.charAt(idx)));
        for(int i = 0; i < values.length(); ++i) {
            sb.append(values.charAt(i));
            backtrack(result, sb, mapping, digits, idx + 1);
            sb.setLength(sb.length() - 1);
        }
    }
}