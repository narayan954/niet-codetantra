ls = list(map(int, input('Enter the list of numbers: ').split()))
print(list(map(str, ls)))
for i in range(1, len(ls)):
    if ls[i] < ls[i-1]:
        temp = ls.pop(i)
        for j in range(i-1, -2, -1):
            if j == -1:
                ls.insert(0, temp)
                break
            if ls[j] < temp:
                ls.insert(j+1, temp)
                break
print(list(map(str, ls)))
