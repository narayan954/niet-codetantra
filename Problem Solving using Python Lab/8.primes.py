a=int(input('Enter first number '))
b=int(input('Enter last number '))
print(f'Prime numbers from  {a} to {b} are')
for n in range(a,b+1):
	flag=0
	for i in range(2,n//2):
		if n%i==0:
			flag=1
			break
	if flag==0:
		print(n,end=' ')
