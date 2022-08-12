n=int(input('Enter number of terms '))
sum=1
a=0
b=1
for i in range(2,n):
	c=a+b
	sum+=c
	a=b
	b=c
print(f'Sum of Fibonacci series upto  {n} th terms {sum}')
