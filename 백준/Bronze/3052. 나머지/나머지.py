
class Solution:
    numbers = []
    for i in range(10):
        number = int(input())
        numbers.append(number % 42)
    
    unique_remainders = set(numbers)
    print(len(unique_remainders))
