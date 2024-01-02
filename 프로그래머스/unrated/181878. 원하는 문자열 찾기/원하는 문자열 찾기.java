class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase(); // 문자열을 소문자로 변환
        pat = pat.toLowerCase(); // 패턴도 소문자로 변환

        return myString.contains(pat) ? 1 : 0; // 소문자로 변환된 문자열에서 패턴이 존재하는지 확인하여 결과 반환
    }
}
