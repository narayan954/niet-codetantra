import sys

n = int(sys.argv[1])

def isPrime(n):
	if (n == 3):
		return 1
	if (n % 2 == 0 or n % 3 == 0):
		return 0
	i = 5
	while (i * i <= n):
		if (n % i == 0 or
			n % (i + 2) == 0):
			return 0
		i = i + 6
	return 1

def primeSum(n):
	count = 0
	primevector = []

	for i in range(2, n + 1):
		if isPrime(i):
			primevector.append(i)
            
	sum = primevector[0]

	for i in range(1, len(primevector)):
		sum += primevector[i]
		if (sum > n):
			break
		if isPrime(sum):
			count += 1
	return count

print(primeSum(n))
