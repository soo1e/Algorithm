import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (Character.isDigit(currentChar)) {
                numbers.add(Character.getNumericValue(currentChar));
            }
        }
        Collections.sort(numbers);
        return numbers;
    }
}

