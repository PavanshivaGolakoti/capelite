t=int(input())
for i in range(t):
    s = input()
    s=sorted(s)
    if(s==s[::-1]):
        print(-1)
    else:
        print("".join(s))
