import sys
s = sys.argv[1]
l = int(sys.argv[2])

def isEqualCharacters(s, l):
  return s[:l]==s[-1:-l-1:-1]

print("true" if isEqualCharacters(s, l) else "false");
