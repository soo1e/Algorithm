import math

def solution(n):
    sqrt_n = math.sqrt(n)
    int_sqrt_n = int(sqrt_n)
    
    if int_sqrt_n * int_sqrt_n == n:
        return 1
    else:
        return 2