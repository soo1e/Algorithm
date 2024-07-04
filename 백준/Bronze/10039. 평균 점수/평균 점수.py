class Solution:
    sum = 0
    for num in range(5):
        A = int(input())
        if A < 40:
            A = 40
        sum = sum + A

    print(int(sum / 5))