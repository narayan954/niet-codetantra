def take_entry(name):
	print(f'Enter values for matrix - {name}')
	m = int(input('Number of rows, m = '))
	n = int(input('Number of columns, n = '))
	ls = []
	for i in range(m):
		temp = []
		for j in range(n):
			print(f'Entry in row: {i+1} column: {j+1}')
			temp.append(int(input()))
		ls.append(temp)
	return ls

matrix_a = take_entry('A')
matrix_b = take_entry('B')
print(f'Matrix - A = {matrix_a}')
print(f'Matrix - B = {matrix_b}')
result = [[sum(a*b for a, b in zip(a_row, b_col)) for b_col in zip(*matrix_b)] for a_row in matrix_a]
print(f'Matrix - A * Matrix- B = {result}')
