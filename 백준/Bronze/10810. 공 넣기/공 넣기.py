N, M = input().split()
N = int(N)
M = int(M)
new_list = [0] * N


for x in range(0, M):
    i, j, k = map(int, input().split())
    for y in range(i, j+1):
        new_list[y - 1] = k

print(*new_list)