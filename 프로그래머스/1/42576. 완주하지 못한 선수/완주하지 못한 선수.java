import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 목록에 있는 이름과 등장 횟수를 기록
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        // 완주한 선수들의 이름을 뺌
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        
        // 남은 이름을 찾아 반환
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }
        
        // 남은 이름이 없으면 예외처리 또는 기본값 반환
        return null;
    }
}