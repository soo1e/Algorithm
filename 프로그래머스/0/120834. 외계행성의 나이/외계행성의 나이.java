class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = String.valueOf(age);
        
        for (char c : ageStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            char alpha = (char)('a' + digit);
            answer += alpha;
        }
        
        return answer;
    }
}
