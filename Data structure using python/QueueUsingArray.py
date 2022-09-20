def takeInput():
    print("Select the Operation:")
    print("1.Enqueue 2.Dequeue 3. Display 4. Quit")
    return int(input())


class Queue:
    def __init__(self):
        self.items = []

    def enqueue(self):
        data = input("Enter the element:")
        self.items.append(data)

    def dequeue(self):
        self.items.pop(0)

    def display(self):
        for i in range(len(self.items)):
            print(self.items[i], '')


size = int(input("Enter the size of Queue:"))
op = takeInput()
q = Queue()
while op != 4:
    if op == 1:
        q.enqueue()
    elif op == 2:
        q.dequeue()
    elif op == 3:
        q.display()
    op = takeInput()
