n=int(input('Enter number of terms '))
odd=0
even=0
#checking number of terms is even or odd and proceeding accordingly
for i in range(1,n+1):
	if i%2==0:
		even+=i
	else:
		odd+=i
print('EVEN =',even)
print('ODD =',odd)
