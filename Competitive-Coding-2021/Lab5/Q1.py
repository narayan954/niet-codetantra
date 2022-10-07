import sys
treeStr = sys.argv[1]
from math import ceil, log

def levelCount (treeStr):
  n = len(treeStr.split())
  return ceil(log(n+1, 2))

print(levelCount(treeStr))
