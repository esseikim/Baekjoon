public class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            // 홀수번째 인덱스는 모든 문자를 대문자로 변환한다.
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else { // 짝수번째 인덱스는 모든 문자를 소문자로 변환한다.
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] result1 = sol.solution(new String[]{"AAA", "BBB", "CCC", "DDD"});
        for (String str : result1) {
            System.out.print(str + " "); // 출력: aaa BBB ccc DDD
        }
        System.out.println();
        
        String[] result2 = sol.solution(new String[]{"aBc", "AbC"});
        for (String str : result2) {
            System.out.print(str + " "); // 출력: abc ABC
        }
        System.out.println();
    }
}