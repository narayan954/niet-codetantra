def get_input():
    return int(input("Select a Operation: 1.Insertion 2.Display 3.Quit "))


class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self):
        self.head = None

    def print_ll(self):
        print('The Inserted elements at the front end are :')
        if self.head is None:
            print("Linked list is empty")
            return
        itr = self.head
        while itr:
            print(itr.data)
            itr = itr.next

    def insert_at_begining(self):
        data = int(input('Enter element '))
        node = Node(data, self.head)
        self.head = node


ll = LinkedList()
while True:
    query = get_input()
    if query == 1:
        ll.insert_at_begining()
    elif query == 2:
        ll.print_ll()
    elif query == 3:
        break
    else:
        print("Invalid Option!!!")
