def largest(a,b,c):
	if a>b and a>c:
		return a
	elif b>c:
		return b
	else:
		return c
a=int(input('Enter First Number '))
b=int(input('Enter Second Number '))
c=int(input('Enter Third number '))
print('Largest number =',largest(a,b,c))
