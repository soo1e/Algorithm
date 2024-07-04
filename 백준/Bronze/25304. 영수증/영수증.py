class Solution:
    N = int(input())
    M = int(input())

    for i in range(M):
        C = list(input().split(' '))
        A = int(C[0])
        B = int(C[1])
        N = N - A * B

    if N == 0:
        print("Yes")
    else:
        print("No")