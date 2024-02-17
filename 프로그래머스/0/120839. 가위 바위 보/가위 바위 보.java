import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        
        // 이길 수 있는 경우의 문자열을 저장한 Map
        Map<Character, Character> winMap = new HashMap<>();
        winMap.put('0', '5'); // 바위(0)를 이기는 경우
        winMap.put('2', '0'); // 가위(2)를 이기는 경우
        winMap.put('5', '2'); // 보(5)를 이기는 경우

        // 주어진 rsp 문자열을 순회하여 이길 수 있는 경우의 문자열을 만든다.
        for (int i = 0; i < rsp.length(); i++) {
            result.append(winMap.get(rsp.charAt(i)));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String rsp1 = "2";
        String rsp2 = "205";

        System.out.println(solution(rsp1)); // 출력: "0"
        System.out.println(solution(rsp2)); // 출력: "052"
    }
}
