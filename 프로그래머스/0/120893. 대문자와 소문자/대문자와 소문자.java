class Solution {
    public static String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String my_string1 = "cccCCC";
        String my_string2 = "abCdEfghIJ";
        
        String result1 = solution(my_string1);
        String result2 = solution(my_string2);
        
        System.out.println(result1); // 출력: "CCCccc"
        System.out.println(result2); // 출력: "ABcDeFGHij"
    }
}
