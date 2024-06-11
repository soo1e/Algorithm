str = input()  
result = []    

for a in str:
    if a.islower():
        result.append(a.upper())  
    else:
        result.append(a.lower())  

print(''.join(result))
