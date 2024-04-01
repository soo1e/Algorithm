import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sortedStr = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedStr.append(arr[i]);
        }
        return sortedStr.toString();
    }
}

