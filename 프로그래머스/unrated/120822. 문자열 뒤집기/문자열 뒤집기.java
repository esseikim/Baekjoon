public class Solution {
    public String solution(String my_string) {
        // 주어진 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();

        // 문자 배열을 뒤집기 위한 두 개의 인덱스를 사용하여 문자열 뒤집기
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // 시작과 끝을 서로 교환하여 뒤집음
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // 뒤집힌 문자 배열을 문자열로 변환하여 반환
        return new String(charArray);
    }
}
