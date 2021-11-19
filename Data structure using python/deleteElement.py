n = int(input('Enter how many elements you want:'))
ls = []
print('Enter numbers in array:')
for i in range(n):
	ls.append(int(input('num:')))
print('ARRAY:',ls)
a = int(input('Enter position you want to delete element:'))
ls.pop(a)
print(ls)
