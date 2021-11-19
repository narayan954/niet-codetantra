ls=list(map(int,input('Enter the list of numbers: ').split()))
for i in range(len(ls)-1,0,-1):
	for j in range(i):
		if ls[j]>ls[j+1]:
			ls[j],ls[j+1] = ls[j+1],ls[j]
print('Sorted list:',ls)
