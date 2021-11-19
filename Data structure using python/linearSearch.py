a=list(map(int,input('Enter the list of numbers: ').split()))
num=int(input('The number to search for: '))
flag=0
k=0
for i in a:
	if i==num:
		flag=1
		break
	k+=1
if flag==1:
	print(f'{num} was found at index {k}.')
else:
	print(num,'was not found.')
