class Solution {
    public int solution(int[] box, int n) {
        int A = box[0] / n;
        int B = box[1] / n;
        int C = box[2] / n;
        int answer = A * B * C;
        return answer;
    }
}