def solution(sides):
    answer = 0
    sides.sort()
    
    if sides[2] >= sides[1] + sides[0]:
        answer = 2
    else:
        answer = 1
    
    return answer