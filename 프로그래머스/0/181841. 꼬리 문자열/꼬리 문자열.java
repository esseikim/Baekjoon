import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                result.append(str);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] str_list1 = {"abc", "def", "ghi"};
        String[] str_list2 = {"abc", "bbc", "cbc"};
        System.out.println(solution(str_list1, "ef")); // 출력: "abcghi"
        System.out.println(solution(str_list2, "c"));  // 출력: ""
    }
}
