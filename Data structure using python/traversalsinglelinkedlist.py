ls = []
for _ in range(int(input("Enter how many elements would you like to add: "))):
    ls.append(int(input("Enter data elements: ")))
print("The linked list is: ")
ls = ls[::-1]
for i in ls:
    print(i)
