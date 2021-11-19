def quicksort(arr):
	if len(arr)<2:
		return arr
	current_pos = 0
	for i in range(1,len(arr)):
		if arr[i]<=arr[0]:
			current_pos += 1
			arr[i],arr[current_pos] = arr[current_pos],arr[i]
	arr[current_pos], arr[0] = arr[0], arr[current_pos]
	left = quicksort(arr[:current_pos])
	right = quicksort(arr[current_pos + 1:])
	return left + [arr[current_pos]] + right

n = int(input("Enter no ofelements"))
print("enter elements")
ls = []
for i in range(n):
	ls.append(int(input()))
print("Unsorted Array")
print(ls)
ls = quicksort(ls)
print("Sorted Array in Ascending Order:")
print(ls)
