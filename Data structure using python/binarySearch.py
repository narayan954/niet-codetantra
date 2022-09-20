def binary_search(ls, l, r, q):
    if r < l:
        return -1
    mid = l + (r-l)//2
    if ls[mid] > q:
        return binary_search(ls, l, mid-1, q)
    elif ls[mid] < q:
        return binary_search(ls, mid+1, r, q)
    return mid


n = int(input('Enter no of elements'))
print('enter elements')
ls = [int(input()) for _ in range(n)]
q = int(input(' Which element you want to search'))
answer = binary_search(ls, 0, len(ls)-1, q)
print(f'The element is present at index  {answer}')
