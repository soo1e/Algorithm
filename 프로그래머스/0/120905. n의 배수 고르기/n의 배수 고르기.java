import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                newList.add(numlist[i]);
            }
        }
        int size = newList.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = newList.get(i);
        }
        return answer;
    }
}