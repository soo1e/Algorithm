import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 유저 목록 저장
        Map<String, Set<String>> reports = new HashMap<>();
        
        // 신고 횟수 저장
        Map<String, Integer> reportCounts = new HashMap<>();
        
        // 초기화
        for (String id : id_list) {
            reports.put(id, new HashSet<>());
            reportCounts.put(id, 0);
        }
        
        // 신고 처리
        for (String rep : report) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            // 중복 처리
            if (!reports.get(reporter).contains(reported)) {
                reports.get(reporter).add(reported);
                reportCounts.put(reported, reportCounts.get(reported) + 1);
            }
        }
        
        // 정지 유저 목록 확인
        Set<String> suspendedUsers = new HashSet<>();
        for (String id : id_list) {
            if (reportCounts.get(id) >= k) {
                suspendedUsers.add(id);
            }
        }
        
        // 결과 메일 발송 횟수
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            int mailCount = 0;
            for (String reported : reports.get(user)) {
                if (suspendedUsers.contains(reported)) {
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }
        
        return answer;
    }
}
