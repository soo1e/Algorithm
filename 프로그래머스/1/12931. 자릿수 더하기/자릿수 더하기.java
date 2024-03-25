import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] charArray = str.toCharArray();
        
        for (char c : charArray) {
           answer = answer + Character.getNumericValue(c); // char를 int로 변환하여 더하기
        }
        return answer;
    }
}