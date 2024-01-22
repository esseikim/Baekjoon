public class Solution {
    public static void main(String[] args) {
        String[] myStrings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(solution(myStrings, parts)); // 출력: "programmers"
    }

    public static String solution(String[] myStrings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < myStrings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            
            // 부분 문자열을 이어 붙임
            result.append(myStrings[i], start, end + 1);
        }

        return result.toString();
    }
}

