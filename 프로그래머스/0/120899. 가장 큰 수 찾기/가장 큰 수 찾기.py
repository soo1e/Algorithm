def solution(array):
    int_max = 0
    idx = 0 
    
    for i in range(len(array)):
        if (array[i] > int_max):
            int_max = array[i]
            idx = array.index(int_max)
    
    answer = [int_max, idx]
    return answer