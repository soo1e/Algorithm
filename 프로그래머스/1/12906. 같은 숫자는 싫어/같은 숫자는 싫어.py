def solution(arr):
    answer = []
    
    # 첫 번째 요소를 무조건 추가
    answer.append(arr[0])
    
    # 두 번째 요소부터 마지막 요소까지 순회
    for i in range(1, len(arr)):
        # 이전 요소와 현재 요소가 다르면 추가
        if arr[i] != arr[i-1]:
            answer.append(arr[i])
    
    return answer
