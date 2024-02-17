import java.util.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                result.append('0'); // 바위(0)는 가위(2)를 이김
            } else if (c == '0') {
                result.append('5'); // 보(5)를 바위(0)를 이김
            } else if (c == '5') {
                result.append('2'); // 가위(2)는 보(5)를 이김
            }
        }

        return result.toString();
    }
}
