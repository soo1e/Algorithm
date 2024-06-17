def solution(rsp):
    win_map = {'2': '0', '0': '5', '5': '2'}

    result = []
    
    for move in rsp:
        result.append(win_map[move])
    
    return ''.join(result)
