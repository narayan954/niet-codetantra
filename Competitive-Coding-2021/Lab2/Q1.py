import sys

s = sys.argv[1]
l = int(sys.argv[2])

def getFirstSubString(s, l):
  if len(s)<l*2-1:
    return "Not Found"
  return s[:l*2:2]

print(getFirstSubString(s, l))
