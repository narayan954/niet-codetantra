def get_input():
	return int(input("Select Opertion 1.Insertion 2.DeletefromStart 3.Display 4.Quit "))
ls = []
while True:	
	query = get_input()
	if query == 1:	
		ls.append(int(input("Enter element ")))	
	
	elif query ==2:
		if not ls:
			print('List is empty')
			continue
		ls.pop(0)
	
	elif query == 3:
		if not ls:
			print("List is empty")	
			continue
		for i in ls:		
			print(i)
			
	elif query == 4:
		break
	
	else:			
		print("Invalid Option!!!")
