import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        // 각 숫자의 등장 횟수를 저장할 Map 생성
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 배열의 각 숫자의 등장 횟수를 계산하여 Map에 저장
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // 최빈값과 그 등장 횟수를 저장할 변수
        int mode = -1;
        int maxFrequency = 0;
        boolean isMultipleModes = false; // 최빈값이 여러 개인지를 나타내는 변수
        
        // Map을 순회하면서 최빈값과 등장 횟수를 찾음
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
                isMultipleModes = false;
            } else if (frequency == maxFrequency) {
                isMultipleModes = true;
            }
        }
        
        // 최빈값이 여러 개일 경우 -1을 반환, 그렇지 않으면 최빈값을 반환
        return isMultipleModes ? -1 : mode;
    }
}
