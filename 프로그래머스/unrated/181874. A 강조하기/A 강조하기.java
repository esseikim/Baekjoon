class Solution {
    public String solution(String myString) {
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a') {
                chars[i] = 'A';
            } else if (Character.isUpperCase(c) && c != 'A') {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}
