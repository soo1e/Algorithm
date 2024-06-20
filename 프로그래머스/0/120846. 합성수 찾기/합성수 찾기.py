def solution(n):
    composite_count = 0

    for i in range(2, n + 1):
        divisor_count = 0
        
        for j in range(1, i + 1):
            if i % j == 0:
                divisor_count += 1
        
        if divisor_count > 2:
            composite_count += 1
            
    return composite_count
