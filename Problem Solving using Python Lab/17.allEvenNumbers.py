n=int(input('How many numbers: '))
k=[]
for i in range(n):
	x=int(input('Enter number '))
	k.append(x)
print('Maximum element in the list is :',max(k),'')
print('Minimum element in the list is :',min(k))
sum=0
for i in k:
	sum+=i
print('Average = ',sum/len(k))
