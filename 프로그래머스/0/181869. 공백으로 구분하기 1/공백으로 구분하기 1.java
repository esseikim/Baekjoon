import java.util.*;

class Solution {
    public static String[] solution(String my_string) {
        String[] words = my_string.split(" "); // 공백을 기준으로 단어 분리

        return words;
    }
    
     public static void main(String[] args) {
        String my_string1 = "i love you";
        String my_string2 = "programmers";

        String[] result1 = solution(my_string1);
        String[] result2 = solution(my_string2);

        // 결과 출력
        System.out.println("Result 1: ");
        for (String word : result1) {
            System.out.println(word);
        }

        System.out.println("\nResult 2: ");
        for (String word : result2) {
            System.out.println(word);
        }
    }
}
