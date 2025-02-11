numbers = [int(input()) for _ in range(9)]  # 9개의 숫자를 입력받아 리스트로 저장
max_value = max(numbers)  # 최댓값 찾기
max_index = numbers.index(max_value) + 1  # 최댓값의 위치 (1부터 시작하는 인덱스)

print(max_value)
print(max_index)
