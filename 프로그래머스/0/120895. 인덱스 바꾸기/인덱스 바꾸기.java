class Solution {
    public String solution(String my_string, int num1, int num2) {
        // StringBuilder를 사용하여 문자열 변경
        StringBuilder sb = new StringBuilder(my_string);

        // num1과 num2에 해당하는 문자를 서로 교환
        char temp = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, temp);

        // 변경된 문자열 반환
        return sb.toString();
    }
}
