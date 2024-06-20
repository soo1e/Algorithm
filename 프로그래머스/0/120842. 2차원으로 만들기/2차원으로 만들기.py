def solution(num_list, n):
    # 2차원 배열을 저장할 리스트 초기화
    result = []
    
    # 리스트를 n개씩 나누기
    for i in range(0, len(num_list), n):
        row = num_list[i:i+n]
        result.append(row)
    
    return result