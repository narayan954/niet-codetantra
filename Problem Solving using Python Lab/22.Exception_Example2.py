num1=int(input('Enter num1: '))
num2=int(input('Enter num2: '))
try:
	c=num1/num2
except:
	print('Exception occured')
else:
	print('Succesful Division, value of num1/num2 ',c)
