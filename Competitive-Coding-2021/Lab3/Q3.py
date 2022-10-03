import sys

n = int(sys.argv[1])


def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i == 0:
            return False
    return True     

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
        if sum<=n and isPrime(sum):
            count += 1
    return count


print(primeSum(n))
