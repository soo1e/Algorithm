class Solution {
    public String solution(String my_string) {
        char[] my_strings = my_string.toCharArray();
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            if (my_strings[i] == 'a' || my_strings[i] == 'e' || my_strings[i] == 'i' || my_strings[i] == 'o' || my_strings[i] == 'u') {
                continue;
            }
            answerBuilder.append(my_strings[i]);
        }
        return answerBuilder.toString();
    }
}
