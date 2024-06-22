def solution(array, n):
    closest_num = None
    min_diff = float('inf')
    
    for num in array:
        # 현재 수와 n의 차이 계산
        diff = abs(num - n)
        
        # 차이가 더 작거나, 차이가 같지만 더 작은 수를 찾으면 갱신
        if diff < min_diff or (diff == min_diff and num < closest_num):
            min_diff = diff
            closest_num = num
    
    return closest_num

