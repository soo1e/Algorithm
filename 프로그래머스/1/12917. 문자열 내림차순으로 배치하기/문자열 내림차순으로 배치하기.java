import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr); // 기본적으로 오름차순 정렬
        // 역순으로 정렬된 배열을 새 문자열로 만듦
        StringBuilder sortedStr = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedStr.append(arr[i]);
        }
        return sortedStr.toString();
    }
}

