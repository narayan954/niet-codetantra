ls1 = []
ls2 = []

for _ in range(int(input("Enter number of elements in first list "))):
    ls1.append(int(input("enter element ")))

for _ in range(int(input("Enter number of elements in second list "))):
    ls2.append(int(input("enter element ")))
ls1.extend(ls2)
ls1.sort()
print("Merged Linked List is:")
for i in ls1:
    print(i, end=' ')
