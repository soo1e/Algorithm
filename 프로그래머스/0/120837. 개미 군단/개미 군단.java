class Solution {
    public int solution(int hp) {
        int generals = hp / 5;
        int remainingHp = hp % 5;
        
        int soldiers = remainingHp / 3;
        remainingHp %= 3;
        
        int answer = generals + soldiers + remainingHp;
        return answer;
    }
}
