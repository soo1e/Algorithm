class Solution:
    S = input()
    counts = [0] * 26

    for char in S:
        if 'a' <= char <= 'z':  # 알파벳 소문자인지 확인
            index = ord(char) - ord('a')
            counts[index] += 1

    print(' '.join(map(str, counts)))
