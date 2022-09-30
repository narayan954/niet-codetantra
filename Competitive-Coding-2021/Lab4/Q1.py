def shortestDistance(s, start, end):
    s = list(map(int,s.split()))
    n = int(len(s)**0.5)
    costs = [float('inf') for i in range(n)]
    stack = [start-1]
    graph = []
    for i in range(n):
        temp = []
        for j in range(n):
            temp.append(s.pop(0))
        graph.append(temp)
    
    costs[start-1] = 0

    while(stack):
        current = stack[0]
        for i in range(n):
            if graph[current][i] != 0:
                newcost = graph[current][i] + costs[current]
                if newcost != 0 and newcost < costs[i]:
                    costs[i] = newcost
                    stack.append(i)
        stack.pop(0)
        
    return costs[end-1]

s = '0 6 0 1 0 6 0 5 0 2 0 5 0 0 5 1 0 0 0 1 0 2 5 1 0'
start = 3
end = 1
print(shortestDistance(s,start,end))
