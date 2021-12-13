a=int(input('Enter value of a '))
b=int(input('Enter value of b '))
c=int(input('Enter value of c '))
d=b*b-4*a*c
if d==0:
	print('Roots are real and equal.')
	print('x1 =',-b/(2*a),', x2 =',-b/(2*a))
elif d>0:
	x1=(-b+d**0.5)/(2*a)
	x2=(-b-d**0.5)/(2*a)
	print('Roots are real and distints.')
	print('x1 =',x1,', x2 =',x2)
else:
	print('Roots are imaginary.')
