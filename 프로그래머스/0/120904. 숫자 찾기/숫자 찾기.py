def solution(num, k):
    num_str = str(num)
    for i, char in enumerate(num_str):
        if int(char) == k:
            return i + 1
    return -1
