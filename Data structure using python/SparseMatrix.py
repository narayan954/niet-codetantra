print('Enter values for Matrix ')
m = int(input('Number of rows, m = '))
n = int(input('Number of columns, n = '))
ls = []

for i in range(m):
	temp = []
	for j in range(n):
		print(f'Entry in row: {i+1} column: {j+1}')
		entry = int(input())
		temp.append(entry)
	ls.append(temp)
	
print(f'Matrix  = {ls}')
print('Sparse Matrix: ')

for i in range(m):
	for j in range(n):
		if ls[i][j] != 0:
			print(f'{i} {j} {ls[i][j]} ')
