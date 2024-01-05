public class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) { // 짝수 번째 인덱스
                strArr[i] = strArr[i].toLowerCase();
            } else { // 홀수 번째 인덱스
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}
