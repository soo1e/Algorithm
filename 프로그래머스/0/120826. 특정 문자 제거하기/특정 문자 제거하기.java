import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder result = new StringBuilder();
        char[] charArr = my_string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == letter.charAt(0)) {
                continue;
            }
            result.append(charArr[i]);
        }
        return result.toString();
    }
}
