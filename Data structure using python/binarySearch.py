def binary_search(ls, l, r, q):
	if r >= l:
		mid = l + (r - l)//2
		if ls[mid] == q:
			return mid
		elif ls[mid] > q:
			return binary_search(ls, l, mid-1, q)
		else:
			return binary_search(ls, mid+1, r, q)
	else:
		return -1

ls = [int(input('Enter your number: ')) for _ in range(int(input('Enter size of list: ')))]
ls.sort()
print('After sorting list is: ',ls)
q = int(input('The number to search for: '))
result = binary_search(ls, 0, len(ls)-1, q)
print(f'{q} was found at index {result}.')
