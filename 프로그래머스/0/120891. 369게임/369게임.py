def solution(order):
    answer = []
    new_answer = 0
    while order > 0:
        answer.append(order % 10)
        order //= 10
    for i in answer:
        if (i != 0) and (i % 3 == 0):
            new_answer = new_answer + 1
    return new_answer