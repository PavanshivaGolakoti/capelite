n=int(input())
l=[]
for i in range(n):
    a = input().split(",")
    a = [int(i) for i in a]
    l.append(a)
def sod(z):
    sum=0
    t=z
    while(z>0):
        r = z%10
        sum+=r
        z=z//10
    if(t%sum==0):
        return True
    return False
m=0
for i in range(n-1):
    for j in range(len(a)-1):
        if sod(l[i][j]) and sod(l[i][j+1]) and sod(l[i+1][j]) and sod(l[i+1][j+1]):
            m=1
            print(str(l[i][j])+","+str(l[i][j+1]))
            print(str(l[i+1][j])+","+str(l[i+1][j+1]))
if m==0:
    print(-1)
        
    
        
