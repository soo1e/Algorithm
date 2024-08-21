def solution(land):
    N = len(land)
    
    # DP 테이블: 초기화 없이 바로 land를 사용
    dp = land
    
    # 2번째 행부터 마지막 행까지 점수 계산
    for row in range(1, N):
        for col in range(4):
            # 이전 행에서 같은 열을 제외한 최대 점수를 더함
            dp[row][col] += max(dp[row - 1][i] for i in range(4) if i != col)
    
    # 마지막 행의 네 칸 중 최대 점수를 반환
    answer = max(dp[N - 1])
    
    return answer