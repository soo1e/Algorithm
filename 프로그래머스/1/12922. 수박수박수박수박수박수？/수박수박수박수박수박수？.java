class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
           if (i % 2 == 0) {
               answer = answer + "수";
           } else if (i % 2 == 1) {
               answer = answer + "박";
           }
        }
        return answer;
    }
    
    
}