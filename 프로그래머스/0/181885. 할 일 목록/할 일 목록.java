import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> unfinishedTasks = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                unfinishedTasks.add(todo_list[i]);
            }
        }

        // ArrayList를 String 배열로 변환
        String[] answer = unfinishedTasks.toArray(new String[0]);

        return answer;
    }
}
