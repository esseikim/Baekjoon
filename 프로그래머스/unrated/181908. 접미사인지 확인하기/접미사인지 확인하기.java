public class Solution {
    public int solution(String my_string, String is_suffix) {
        int myStringLength = my_string.length();
        int suffixLength = is_suffix.length();

        if (myStringLength < suffixLength) {
            return 0;
        }

        for (int i = 0; i < suffixLength; i++) { // 문자열 끝에서부터 시작해서 일치 여부를 확인
            if (my_string.charAt(myStringLength - suffixLength + i) != is_suffix.charAt(i)) {
                return 0;
            }
        }

        return 1;
    }
}