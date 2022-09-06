import sys
s = sys.argv[1]
ls = list("abcdefghijklmnopqrstuvwxyz")

def isSuper(s):
    for i in set(s):
        if s.count(i) != ls.index(i)+1:
            return False
    return True

print("true" if isSuper(s) else "false");
