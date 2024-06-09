class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int[] size : sizes) {
            // 큰 값을 가로, 작은 값을 세로로 정렬
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            // 최대 가로 길이와 최대 세로 길이를 갱신
            if (w > maxWidth) maxWidth = w;
            if (h > maxHeight) maxHeight = h;
        }
        
        // 지갑의 크기는 최대 가로 길이와 최대 세로 길이의 곱
        return maxWidth * maxHeight;
    }
}
