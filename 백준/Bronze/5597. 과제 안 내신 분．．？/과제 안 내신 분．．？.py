new_list = []
for i in range(30):
    new_list.append(i+1)

for _ in range(28):
    A = int(input())
    if A in new_list:
        new_list.remove(A)
print(new_list[0])
print(new_list[1])