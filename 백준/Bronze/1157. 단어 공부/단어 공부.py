new_str = input().upper()
new_str_list = list(new_str[::])

count = [0] * 26

for char in new_str_list:
    if 'A' <= char <= 'Z':
        count[ord(char) - ord('A')] = count[ord(char) - ord('A')] + 1

max_count = max(count)
max_char = chr(ord('a') + count.index(max_count))


if count.count(max_count) > 1:
    print('?')
else:
    print(max_char.upper())
