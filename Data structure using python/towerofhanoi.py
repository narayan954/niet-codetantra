def tow(n, start, mid, end):
    if n == 1:
        print(f"Move disk {n} from source {start} to destination {end}")
        return
    tow(n-1, start, end, mid)
    print(f"Move disk {n} from source {start} to destination {end}")
    tow(n-1, mid, start, end)


n = int(input(" enter no of disk"))
tow(n, "A", "C", "B")
