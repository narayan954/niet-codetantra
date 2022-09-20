ls = []
for _ in range(int(input("Enter Number of Elements to Insert in DoublyLinkedList "))):
    ls.append(int(input("Enter Element ")))
print("Traversal in forward direction")
for i in ls[::-1]:
    print(i)
print("Traversal in reverse direction")
for i in ls:
    print(i)
