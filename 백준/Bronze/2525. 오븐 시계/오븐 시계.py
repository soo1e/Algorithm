A, B = input().split()
A = int(A)
B = int(B)

C = int(input())

B = B + C
if B >= 60:
    D = B // 60
    B = B % 60
    A = A + (1 * D)
    if A >= 24:
        A = A - 24

print(int(A), int(B))