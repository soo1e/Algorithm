def solution(info, edges):
    
    # 방문을 체크할 수 있는 배열을 선언한다.
    visited = [0] * len(info)
    answer = []

    def dfs(sheep, wolf):
        # 만약 늑대가 양보다 크거나 같으면 빠져나온다.
        if sheep > wolf:
            answer.append(sheep)
        else:
            return
        # 모든 edge를 확인한다.
        for p, c in edges:
            # 부모가 방문된 상태이고 자식이 아직 방문되지 않은 상태라면 방문한다.
            if visited[p] and not visited[c]:
                # 다음 노드를 방문표시한다.
                visited[c] = True
                # 다음 노드가 양이라면 sheep + 1을 한다.
                if info[c] == 0:
                    dfs(sheep + 1, wolf)
                #✅✅✅ 다음 노드가 양이라면 wolf + 1을 한다.
                else:
                    dfs(sheep, wolf + 1)
                # 다음 노드를 방문표시 해제한다.
                visited[c] = False
    # 0번 노드를 방문한 상태로 시작한다.
    visited[0] = True
    # DFS를 시작한다.
    dfs(1, 0)

    # 방문한 경우의 수중 가장 양을 많이 방문한 경우를 반환한다.
    return max(answer)