def solution(cipher, code):
    answer = ''
    for str in cipher[code-1::code]:
        answer = answer + str
    return answer