import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        // lottos 배열에서 0의 개수를 count
        int zeroCount = (int)Arrays.stream(lottos).filter(num -> num == 0).count();
        
        // lottos 배열에서 0을 제외한 숫자들과 win_nums 배열에서 일치하는 숫자들을 count
        int matchCount = (int)Arrays.stream(lottos).filter(num -> num != 0 && Arrays.stream(win_nums).anyMatch(win -> win == num)).count();
        
        // 최고 순위 계산 (0의 개수 + 일치하는 숫자 개수)
        answer[0] = getRank(zeroCount + matchCount);
        
        // 최저 순위 계산 (일치하는 숫자 개수)
        answer[1] = getRank(matchCount);
        
        return answer;
    }
    
    // 순위 계산 메소드
    private int getRank(int count) {
        if (count == 6) return 1;
        else if (count == 5) return 2;
        else if (count == 4) return 3;
        else if (count == 3) return 4;
        else if (count == 2) return 5;
        else return 6;
    }
}
