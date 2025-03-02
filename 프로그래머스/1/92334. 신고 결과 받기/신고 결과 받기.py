def solution(id_list, report, k):
    
    # 1. 신고 기록 정리 (중복 제거)
    report_dict = {user: set() for user in id_list}
    for rep in report:
        user, reported = rep.split()
        report_dict[user].add(reported)
    
    # 2. 신고 횟수 계산
    reported_count = {user: 0 for user in id_list}
    for reports in report_dict.values():
        for reported in reports:
            reported_count[reported] += 1
    
    # 3. 정지된 유저 확인
    suspended_users = {user for user, count in reported_count.items() if count >= k}
    
    # 4. 각 유저별 결과 메일 수 계산
    result = []
    for user in id_list:
        result.append(len(report_dict[user] & suspended_users))
    
    return result
