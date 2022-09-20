ls = []
while True:
    n = input('Enter element, \'XXX\' to end: ')
    if n == 'XXX':
        break
    else:
        ls.append(n)
print('Initial stack')
print(ls)
print('Elements poped from stack:')
for i in range(3):
    print(ls.pop())
print('Stack after elements are poped:')
print(ls)
