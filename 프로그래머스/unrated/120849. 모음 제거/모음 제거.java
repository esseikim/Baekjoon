import java.util.regex.*;

class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
