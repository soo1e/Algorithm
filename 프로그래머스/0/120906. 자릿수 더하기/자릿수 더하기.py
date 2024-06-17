def solution(n):
    new_sum = 0
    for digit in str(n):  # `n`을 문자열로 변환하여 각 문자로 반복
        new_sum += int(digit)  # 각 문자를 정수로 변환하여 합산
    return new_sum
