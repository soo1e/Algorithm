def solution(my_string):
    new_answer = list(my_string.lower())
    new_answer.sort()
    answer = ''.join(new_answer)
    return answer