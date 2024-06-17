def solution(my_string):
    answer = ''
    for str in range(len(my_string)):
        if my_string[str].isupper():
            answer = answer + my_string[str].lower()
        elif my_string[str].islower():
            answer = answer + my_string[str].upper()
            
    return answer