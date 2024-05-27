import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] priorities, int location) {
        List<int[]> processList = new ArrayList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            processList.add(new int[]{priorities[i], i});
        }
        
        int executionOrder = 0;
        
        while (!processList.isEmpty()) {
            int[] current = processList.remove(0);
            boolean hasHigherPriority = false;
            
            for (int[] process : processList) {
                if (process[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            if (hasHigherPriority) {
                processList.add(current);
            } else {
                executionOrder++;
                if (current[1] == location) {
                    return executionOrder;
                }
            }
        }
        
        return -1;
    }
}
