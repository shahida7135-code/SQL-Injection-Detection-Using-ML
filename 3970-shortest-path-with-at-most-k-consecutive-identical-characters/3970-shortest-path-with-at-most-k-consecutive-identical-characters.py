from typing import List
import heapq

class Solution:
    def shortestPath(self, n: int, edges: List[List[int]], labels: str, k: int) -> int:
        graph = [[] for _ in range(n)]

        for u, v, w in edges:
            graph[u].append((v, w))

        INF = float('inf')

        dist = [dict() for _ in range(n)]
        dist[0][1] = 0

        pq = [(0, 0, 1)]  # (cost, node, streak)

        while pq:
            cost, u, streak = heapq.heappop(pq)

            if dist[u].get(streak, INF) != cost:
                continue

            for v, w in graph[u]:

                if labels[v] == labels[u]:
                    new_streak = streak + 1
                    if new_streak > k:
                        continue
                else:
                    new_streak = 1

                new_cost = cost + w

                if new_cost < dist[v].get(new_streak, INF):
                    dist[v][new_streak] = new_cost
                    heapq.heappush(pq, (new_cost, v, new_streak))

        ans = min(dist[n - 1].values(), default=INF)

        return -1 if ans == INF else ans