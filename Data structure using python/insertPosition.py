ls = []
n = int(input('Enter how many elements you want:'))
print('Enter numbers in array:')
for i in range(n):
	ls.append(int(input('num:')))
print('ARRAY:',ls)
i = int(input('Enter position you want to enter element:'))
e = int(input('Enter the element you want to enter:'))
ls.insert(i,e)
print(ls)
