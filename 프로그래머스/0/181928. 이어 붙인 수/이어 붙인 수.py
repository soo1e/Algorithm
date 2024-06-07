def solution(num_list):
    # 홀수와 짝수를 각각 문자열로 이어 붙이기 위해 리스트 초기화
    odd_str = ''
    even_str = ''
    
    # 주어진 리스트를 순회하며 홀수와 짝수를 구분
    for num in num_list:
        if num % 2 == 0:
            even_str += str(num)
        else:
            odd_str += str(num)
    
    # 이어 붙인 문자열을 정수로 변환
    odd_number = int(odd_str) if odd_str else 0
    even_number = int(even_str) if even_str else 0
    
    # 홀수와 짝수로 만든 숫자의 합을 반환
    return odd_number + even_number
