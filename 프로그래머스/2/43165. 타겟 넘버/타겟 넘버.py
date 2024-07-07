def solution(numbers, target):
    def dfs(index, current_sum):
        # 모든 숫자를 다 사용했을 때
        if index == len(numbers):
            # 현재 합이 타겟과 같은 경우 방법의 수를 1 증가
            return 1 if current_sum == target else 0
        # 현재 숫자를 더하거나 뺀 두 가지 경우를 재귀적으로 탐색
        return dfs(index + 1, current_sum + numbers[index]) + dfs(index + 1, current_sum - numbers[index])
    
    return dfs(0, 0)