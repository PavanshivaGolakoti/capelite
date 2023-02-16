import math
n=input()
l=[]
for i in range(len(n)):
    for j in range(i,len(n)):
        l.append(n[i:j+1])
def pronic(n):
    n=int(n)
    if n==0:
        return False
    sq = int(math.sqrt(n))
    if sq*(sq+1)==n:
        return True
    return False
        
a=[]
for i in l:
    if pronic(i):
        a.append(int(i))
if(len(a)<1):
    print(-1)
    exit()
a=list(set(a))
a.sort()
a=[str(i) for i in a]
print(",".join(a))
