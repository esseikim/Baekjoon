class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
