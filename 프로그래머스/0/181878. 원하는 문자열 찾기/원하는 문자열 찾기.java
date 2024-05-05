class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String subString = lowerMyString.substring(i, i + pat.length());
            if (subString.equals(lowerPat)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
