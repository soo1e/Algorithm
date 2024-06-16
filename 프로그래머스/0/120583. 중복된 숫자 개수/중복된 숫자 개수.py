def solution(array, n):
    array.sort()
    answer = 0
    
    for i in array:
        if i == n:
            answer = answer + 1
    return answer