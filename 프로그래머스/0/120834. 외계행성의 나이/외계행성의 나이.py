def solution(age):
    # 숫자에서 알파벳으로 매핑하는 테이블
    digit_to_char = {
        0: 'a', 1: 'b', 2: 'c', 3: 'd', 4: 'e',
        5: 'f', 6: 'g', 7: 'h', 8: 'i', 9: 'j'
    }
    
    # 문자열로 변환한 나이
    age_str = str(age)
    
    # 결과를 저장할 빈 문자열
    result = ""
    
    # 각 숫자를 알파벳으로 변환
    for digit in age_str:
        # 숫자에서 알파벳으로 변환하여 결과에 추가
        result += digit_to_char[int(digit)]
    
    return result
