import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                newArr.add(arr[i]);
            }
        }

        // 새로운 리스트가 비어 있는지 확인
        if (newArr.isEmpty()) {
            // 비어 있다면 -1을 요소로 갖는 배열을 반환
            return new int[]{-1};
        }

        // 리스트를 정렬
        Collections.sort(newArr);

        // 정렬된 리스트를 배열로 변환하여 반환
        int[] answer = new int[newArr.size()];
        for (int i = 0; i < newArr.size(); i++) {
            answer[i] = newArr.get(i);
        }
        return answer;
    }
}

