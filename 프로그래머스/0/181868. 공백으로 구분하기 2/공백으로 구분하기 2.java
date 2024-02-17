import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String my_string) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        
        // 문자열을 순회하면서 공백을 기준으로 단어를 추출한다.
        for (char c : my_string.toCharArray()) {
            if (c == ' ') { // 공백을 만나면 지금까지 저장한 단어를 리스트에 추가하고 초기화
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0); // StringBuilder 초기화
                }
            } else { // 공백이 아니면 단어를 추가한다.
                word.append(c);
            }
        }
        
        // 마지막 단어가 공백으로 끝나지 않는 경우에 추가
        if (word.length() > 0) {
            words.add(word.toString());
        }
        
        // 리스트를 배열로 변환하여 반환합니다.
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] result1 = sol.solution(" i    love  you");
        for (String word : result1) {
            System.out.print(word + " "); // 출력: i love you
        }
        System.out.println();
        
        String[] result2 = sol.solution("    programmers  ");
        for (String word : result2) {
            System.out.print(word + " "); // 출력: programmers
        }
        System.out.println();
    }
}
