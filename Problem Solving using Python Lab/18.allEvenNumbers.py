a=input('Enter elements separated by a comma:').split(',')
b=[int(x) for x in a if int(x)%2==0]
print('Even numbers in the list: ',b)
