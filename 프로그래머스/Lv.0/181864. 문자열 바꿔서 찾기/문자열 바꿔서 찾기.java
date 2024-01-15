import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        String pat = sc.next();
        
        int result = solution(myString, pat);
        System.out.println(result);
    }

    public static int solution(String myString, String pat) {
        StringBuilder convertedString = new StringBuilder(myString.length());

        // A를 B로, B를 A로 바꾸기
        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                convertedString.append('B');
            } else if (ch == 'B') {
                convertedString.append('A');
            }
        }

        // StringBuilder를 String으로 변환
        String convertedStringStr = convertedString.toString();

        // pat이 있는지 확인
        for (int i = 0; i <= convertedStringStr.length() - pat.length(); i++) {
            if (convertedStringStr.substring(i, i + pat.length()).equals(pat)) {
                return 1;
            }
        }

        return 0;
    }
}
