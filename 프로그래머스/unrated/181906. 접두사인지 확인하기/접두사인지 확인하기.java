public class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) { // startsWith 메서드를 사용하여 is_prefix 문자열이 my_string의 접두사인지 확인
            return 1;
        } else {
            return 0;
        }
    }
}