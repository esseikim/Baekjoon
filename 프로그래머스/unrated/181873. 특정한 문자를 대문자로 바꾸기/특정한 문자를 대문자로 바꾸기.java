class Solution {
    public String solution(String my_string, String alp) {
        char target = alp.charAt(0); // 대상 문자

        // StringBuilder를 사용하여 문자열 수정
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (c == target) {
                // 대상 문자와 일치하는 경우 대문자로 변경하여 StringBuilder에 추가
                result.append(Character.toUpperCase(c));
            } else {
                // 일치하지 않는 경우 그대로 추가
                result.append(c);
            }
        }

        return result.toString();
    }
}
