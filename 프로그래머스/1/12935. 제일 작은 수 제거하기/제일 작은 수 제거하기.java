import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1보다 작거나 같은 경우, -1이 담긴 배열을 반환합니다.
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        // 최솟값을 찾기 위해 배열을 복사하여 정렬합니다.
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        // 최솟값의 인덱스를 찾습니다.
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sortedArr[0]) {
                minIndex = i;
                break;
            }
        }
        
        // 최솟값을 제외한 배열을 생성합니다.
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}
