def get_input():
    return int(input("Select a Operation 1.Insertion 2.Sorting 3.Display 4.Quit "))


ls = []
while True:
    query = get_input()
    if query == 1:
        ls.append(int(input("Enter a element ")))
    elif query == 2:
        if not ls:
            print('List is Empty')
        ls.sort()
        #ls = sorted(ls,reverse=True)
    elif query == 3:
        for i in ls:
            print(i)
    else:
        break
