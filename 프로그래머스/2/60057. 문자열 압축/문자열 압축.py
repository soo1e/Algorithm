def solution(s):
    n = len(s)
    answer = n  # 초기 답은 압축되지 않은 원래 문자열의 길이

    # 1부터 문자열 길이의 절반까지를 단위로 잘라 압축
    for size in range(1, n // 2 + 1):
        compressed = ""
        prev = s[:size]
        count = 1

        # 문자열을 size 단위로 잘라 반복
        for i in range(size, n, size):
            if s[i:i + size] == prev:
                count += 1
            else:
                # 반복된 경우는 count와 함께, 아니면 그냥 추가
                compressed += (str(count) + prev) if count > 1 else prev
                prev = s[i:i + size]
                count = 1
        
        # 남은 문자열 처리
        compressed += (str(count) + prev) if count > 1 else prev

        # 가장 짧은 압축 결과 길이 갱신
        answer = min(answer, len(compressed))
    
    return answer
