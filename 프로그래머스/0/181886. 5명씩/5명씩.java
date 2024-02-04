// class Solution {
//     public String[] solution(String[] names) {
//         String[] answer = new String[names.length / 5 + 1];

//         for (int i = 0; i <= names.length / 5; i += 5) {
//             answer[i / 5] = names[i];
//         }

//         return answer;
//     }
// }
// class Solution {
//     public String[] solution(String[] names) {
//         String[] answer = new String[names.length / 5 + 1];

//         for (int i = 0; i < names.length; i += 5) {
//             answer[i / 5] = names[i];
//         }

//         return answer;
//     }
// }

public class Solution {
    public static String[] solution(String[] names) {
        int resultSize = (int) Math.ceil((double) names.length / 5);
        String[] result = new String[resultSize];

        for (int i = 0; i < resultSize; i++) {
            result[i] = names[i * 5];
        }

        return result;
    }
}