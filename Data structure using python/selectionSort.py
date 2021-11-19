ls = input('Enter the list of numbers: ').split()
for i in range(len(ls)):
	min = i
	for j in range(i + 1, len(ls)):
		if ls[min] > ls[j]:
			min = j
	ls[i], ls[min] = ls[min], ls[i]
print(ls)
