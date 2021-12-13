a=int(input('Enter number of terms '))
f=1
s=0
for i in range(1,a+1):
	f=f*i
	s+=f
print('Sum of series =',s)
