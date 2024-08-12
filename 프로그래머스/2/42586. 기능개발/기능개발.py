import math

def solution(progresses, speeds):
    answer = []
    days = []

    # 각 작업이 완료되는 데 걸리는 일수를 계산
    for p, s in zip(progresses, speeds):
        day = math.ceil((100 - p) / s)
        days.append(day)
    
    # 첫 배포 그룹의 기준일
    current_day = days[0]
    count = 0

    for day in days:
        if day <= current_day:
            # 현재 배포 그룹에 포함
            count += 1
        else:
            # 현재 배포 그룹을 완료하고 새로운 그룹 시작
            answer.append(count)
            current_day = day
            count = 1

    # 마지막 그룹의 수를 추가
    answer.append(count)
    
    return answer
