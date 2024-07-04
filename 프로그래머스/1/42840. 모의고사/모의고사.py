def solution(answers):
    leng = len(answers)
    A = []
    B = []
    C = []

    A_Count = 0
    B_Count = 0
    C_Count = 0

    A_pattern = [1, 2, 3, 4, 5]
    for i in range(leng):
        A.append(A_pattern[i % len(A_pattern)])

    B_pattern = [2, 1, 2, 3, 2, 4, 2, 5]
    for i in range(leng):
        B.append(B_pattern[i % len(B_pattern)])

    C_pattern = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    for i in range(leng):
        C.append(C_pattern[i % len(C_pattern)])

    for i in range(0, len(answers)):
        if (answers[i] == A[i]):
            A_Count = A_Count + 1

        if (answers[i] == B[i]):
            B_Count = B_Count + 1

        if (answers[i] == C[i]):
            C_Count = C_Count + 1

    scores = [(1, A_Count), (2, B_Count), (3, C_Count)]

    max_score = max(A_Count, B_Count, C_Count)

    result = [person for person, score in scores if score == max_score]
    result.sort()

    return result

