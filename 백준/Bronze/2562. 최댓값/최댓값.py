new_list = []
max_int = 0
max_idx = None
for i in range(0, 9):
    A = int(input())
    new_list.append(A)
    if A > max_int:
        max_int = A
        max_idx = i

print(max_int)
print(max_idx + 1)