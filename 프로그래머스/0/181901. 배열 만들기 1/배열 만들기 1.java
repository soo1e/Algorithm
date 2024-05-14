import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> multiples = new ArrayList<>();
        
        // 1 이상 n 이하의 정수 중에서 k의 배수를 찾아내고 리스트에 추가
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                multiples.add(i);
            }
        }
        
        // 리스트를 오름차순으로 정렬
        Collections.sort(multiples);
        
        // 리스트를 배열로 변환
        int[] answer = new int[multiples.size()];
        for (int i = 0; i < multiples.size(); i++) {
            answer[i] = multiples.get(i);
        }
        
        return answer;
    }
}
