n=int(input('Enter n: '))
for i in range(1,n):
	for j in range(1,n-i):
		print('  ',end='')
	for j in range(1,2*i):
		print('*',end=' ')
	print()
