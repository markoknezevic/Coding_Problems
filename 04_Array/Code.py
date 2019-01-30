arr=[]
n=int(input())
for i in range(n):
    a=int(input())
    arr.append(a)
j=1
for i in range(int(len(arr)+1)):
    if(j not in arr):
        print(j)
        break
    j=j+1