class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();

			  // 주어진 문자열을 순회하면서 소문자 모음인 'a', 'e', 'i', 'o', 'u'를 제거하고 결과 문자열을 반환
        for (char c : my_string.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    private boolean isVowel(char c) { // 해당 문자가 모음인지 확인
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}