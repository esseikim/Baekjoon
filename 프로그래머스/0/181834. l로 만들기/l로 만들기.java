public class Solution {
    public static String solution(String myString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c < 'l') {
                result.append('l');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz")); // 출력: "lllllvwxyz"
        System.out.println(solution("jjnnllkkmm")); // 출력: "llnnllllmm"
    }
}
