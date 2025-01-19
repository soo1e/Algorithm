from collections import deque

def solution(queue1, queue2):
    
    # 주어진 큐를 deque를 통해 q1, q2 생성
    q1 = deque(queue1)
    q2 = deque(queue2)

    # 각 큐의 합을 미리 계산
    sum1 = sum(q1)
    sum2 = sum(q2)

    # 목표는 두 큐의 합이 같아지는 것
    target = (sum1 + sum2) // 2

    # 큐의 총 길이
    q_size = len(q1)

    # q1과 q2에서 원소를 옮기는 과정의 최대 횟수는 (큐 길이) * 3
    for i in range(0, 3 * q_size):
        # q1의 합이 target과 같다면 이를 리턴한다.
        if sum1 == target:
            return i

        # 만약 q1의 합이 target보다 작으면 q2에서 요소를 가져와서 더한다.
        elif sum1 < target:
            temp = q2.popleft()
            q1.append(temp)
            sum1 += temp
            sum2 -= temp

        # 만약 q1의 합이 target보다 크면 q1에서 요소를 가져와서 q2로 더한다.
        else:
            temp = q1.popleft()
            q2.append(temp)
            sum1 -= temp
            sum2 += temp

    # 반복문을 다 돌렸을 때 안 되면 -1을 리턴
    return -1
