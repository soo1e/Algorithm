def solution(sequence, k):
    # 슬라이딩 윈도우의 시작과 끝 인덱스를 초기화
    start, end = 0, 0
    # 현재 슬라이딩 윈도우 안의 수열의 합을 초기화
    current_sum = sequence[0]
    # 최소 길이를 무한대로 초기화하여 비교를 위한 기준 설정
    min_length = float('inf')
    # 조건을 만족하는 최적의 부분 수열의 시작과 끝 인덱스를 저장할 리스트
    answer = []

    # end가 수열의 끝에 도달할 때까지 반복
    while end < len(sequence):
        # 현재 부분 수열의 합이 k와 같은 경우
        if current_sum == k:
            # 현재 부분 수열의 길이를 계산
            current_length = end - start + 1
            # 현재 부분 수열의 길이가 기존의 최소 길이보다 짧은 경우
            if current_length < min_length:
                # 최소 길이를 업데이트하고, 해당 부분 수열의 인덱스를 저장
                min_length = current_length
                answer = [start, end]
            # 부분 수열의 길이가 같을 경우, 시작 인덱스가 더 앞서는지 확인
            elif current_length == min_length and start < answer[0]:
                answer = [start, end]
            
        # 현재 부분 수열의 합이 k보다 작거나 같은 경우
        if current_sum <= k:
            # 끝 인덱스를 오른쪽으로 한 칸 이동하여 수열 확장
            end += 1
            # end가 수열의 범위를 넘지 않는지 확인한 후 합을 업데이트
            if end < len(sequence):
                current_sum += sequence[end]
        # 현재 부분 수열의 합이 k보다 큰 경우
        else:
            # 시작 인덱스를 오른쪽으로 한 칸 이동하여 수열 축소
            current_sum -= sequence[start]
            start += 1
    
    # 조건을 만족하는 최적의 부분 수열의 시작과 끝 인덱스를 반환
    return answer
