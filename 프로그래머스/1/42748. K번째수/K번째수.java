import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int k = command[2] - 1;
            
            int[] subArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(subArray);
            
            // k번째 수 구하기
            answer[i] = subArray[k];
        }
        
        return answer;
    }
}
