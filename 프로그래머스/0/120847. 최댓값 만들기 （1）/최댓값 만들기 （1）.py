def solution(numbers):
    answer = 0
    numbers.sort()
    new_arr = numbers[::-1]
    answer = new_arr[0] * new_arr[1]
    return answer