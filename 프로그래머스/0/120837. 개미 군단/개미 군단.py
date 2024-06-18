def solution(hp):
    a = int (hp / 5)
    b = int ((hp - (a * 5)) / 3)
    c = hp - (a * 5) - (b * 3)
    answer = a + b + c

    return answer