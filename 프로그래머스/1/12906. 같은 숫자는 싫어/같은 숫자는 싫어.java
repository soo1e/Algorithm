import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]); // 첫 번째 요소 추가

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // 현재 값과 이전 값이 다를 때만 추가
                arrayList.add(arr[i]);
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
