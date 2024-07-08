def solution(brown, yellow):
    total = brown + yellow
    result = []

    def backtrack(start, total, yellow):
        if result:
            return
        
        for height in range(start, total // 2 + 1):
            if total % height == 0:
                width = total // height
                if width >= height and (width - 2) * (height - 2) == yellow:
                    result.append([width, height])
                    return

    backtrack(3, total, yellow)
    return result[0]