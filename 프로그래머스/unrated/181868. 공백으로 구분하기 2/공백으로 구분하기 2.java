public class Solution {
    public String[] solution(String my_string) {
        // 공백을 기준으로 문자열 나누기
        String[] words = my_string.trim().split("\\s+");

        return words;
    }
}
