def factorial(n, accumulator = 1):
	return accumulator if n <= 1 else factorial(n-1, accumulator * n)
	
num = int(input('Enter a number: '))
print(f'The factorial of {num} is {factorial(num)}')
