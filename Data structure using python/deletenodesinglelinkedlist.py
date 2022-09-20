def get_input():
    return int(input("Select an Operation:\n1.Insert\n2.Deletion\n3.Display\n4.Quit	"))


class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self):
        self.head = None

    def print_ll(self):
        if self.head is None:
            print("Linked list is empty")
            return
        itr = self.head
        while itr:
            print(itr.data)
            itr = itr.next

    def get_length(self):
        count = 0
        itr = self.head
        while itr:
            count += 1
            itr = itr.next
            return count

    def insert_at_begining(self):
        data = int(input('Enter Element '))
        node = Node(data, self.head)
        self.head = node

    def remove_at(self):
        index = int(input('Enter a position '))
        if index < 0:
            raise Exception("Invalid Index")
        if index > self.get_length():
            print("Position is more than number of nodes")
            return
        if index == 0:
            self.head = self.head.next
            return
        count = 0
        itr = self.head
        while itr:
            if count == index - 1:
                itr.next = itr.next.next
                break
            itr = itr.next
            count += 1


ll = LinkedList()
while True:
    query = get_input()
    if query == 1:
        ll.insert_at_begining()
    elif query == 2:
        ll.remove_at()
    elif query == 3:
        ll.print_ll()
    elif query == 4:
        break
    else:
        print("Invalid Option!!!")
