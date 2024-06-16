def solution(array):
    answer = 0
    array.sort()
    idx = int(len(array)/2)
    return array[idx]