from collections import deque

def solution(numbers, target):
    queue = deque([(0, 0)])  # (현재 인덱스, 현재 합)
    count = 0
    
    while queue:
        index, current_sum = queue.popleft()
        
        if index == len(numbers):
            if current_sum == target:
                count += 1
        else:
            queue.append((index + 1, current_sum + numbers[index]))
            queue.append((index + 1, current_sum - numbers[index]))
    
    return count