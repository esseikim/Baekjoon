public class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase(); // 대소문자 구분하지 않으므로 모두 소문자로 변환
        pat = pat.toLowerCase();

        int n = myString.length();
        int m = pat.length();

        // myString에서 pat의 길이만큼씩 잘라서 비교
        for (int i = 0; i <= n - m; i++) {
            String subString = myString.substring(i, i + m);
            if (subString.equals(pat)) { // 부분 문자열이 pat과 일치하는지 확인
                return 1; // 일치하면 1 반환
            }
        }
        return 0; // 일치하는 부분 문자열을 찾지 못했을 때 0 반환
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString1 = "AbCdEfG";
        String pat1 = "aBc";
        String myString2 = "aaAA";
        String pat2 = "aaaaa";
        System.out.println(sol.solution(myString1, pat1)); // 출력: 1
        System.out.println(sol.solution(myString2, pat2)); // 출력: 0
    }
}
