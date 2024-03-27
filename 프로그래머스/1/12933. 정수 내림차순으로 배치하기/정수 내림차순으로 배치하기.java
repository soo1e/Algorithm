import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int digitCount = (int)(Math.log10(n) + 1);
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= digitCount; i++) { // i를 1부터 시작하도록 수정
            newList.add((int)(n % 10));
            n = n / 10;
        }
        Collections.sort(newList, Collections.reverseOrder());
        for (int digit : newList) {
            answer = answer * 10 + digit;
        }
        return answer;
    }
}
