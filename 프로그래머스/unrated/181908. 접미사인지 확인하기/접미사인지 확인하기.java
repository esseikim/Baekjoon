public class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) { // endsWith 메서드를 사용해 my_string의 끝이 is_suffix로 끝나는지 확인. endsWith는 불리언 값을 반환하며, true면 접미사인 것으로 간주
            return 1;
        } else {
            return 0;
        }
    }
}