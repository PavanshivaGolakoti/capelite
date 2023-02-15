s=input()
n=int(input())
k=0
for i in s:
    if(s.count(i)==1):
        k=k+1
        if(k==n):
            print(i)
            exit()
print(-1)
