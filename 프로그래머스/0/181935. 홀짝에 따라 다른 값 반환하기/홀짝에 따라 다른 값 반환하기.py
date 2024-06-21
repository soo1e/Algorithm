def solution(n):
    if n % 2 == 1:
        odd_sum = sum(range(1, n+1, 2))
        return odd_sum
    else:
        even_squares_sum = sum(i * i for i in range(2, n+1, 2))
        return even_squares_sum