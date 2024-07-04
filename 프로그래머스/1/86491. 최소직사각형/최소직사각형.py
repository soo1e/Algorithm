from typing import List

def solution(sizes: List[List[int]]) -> int:
    max_width = 0
    max_height = 0

    for size in sizes:
        width = max(size)  # 명함의 가로 길이
        height = min(size)  # 명함의 세로 길이
        
        # 최대 가로 길이와 최대 세로 길이 갱신
        if width > max_width:
            max_width = width
        if height > max_height:
            max_height = height

    return max_width * max_height