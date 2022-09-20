ls1 = []
ls2 = []
for _ in range(int(input("Enter number of elements for list1 "))):
    ls1.append(int(input("Enter Element ")))

ls1 = ls1[::-1]

print("Elements of List1: ")
for i in ls1:
    print(i)

for _ in range(int(input("Enter number of elements for list2 "))):
    ls2.append(int(input("Enter Element ")))

ls2 = ls2[::-1]

print("Elements of List2: ")
for i in ls2:
    print(i)
if len(ls1) > len(ls2):
    ls2.extend(ls1)
    ls = ls2
else:
    ls1.extend(ls2)
    ls = ls1

if ls[3] == 32:
    ls.insert(0, ls.pop(3))

print("Final List:")
for i in ls:
    print(i)
