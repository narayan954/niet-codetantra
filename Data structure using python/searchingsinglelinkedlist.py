def get_input():
	return int(input("Select Operation:\n1.Insertion\n2.Searching\n3.Display\n4.Quit	"))

	
ls = []
while True:
	query = get_input()
	if query == 1:
		ls.append(int(input("Enter elements ")))
		
	elif query == 2:
		key = int(input("Enter a key to search "))
		print('Item found' if key in ls else 'item not found')
	elif query == 3:	
		for i in ls[::-1]:
			print(i)
		
	else:	
		break
