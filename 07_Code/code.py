#a={1:"a",2:"b",3:"c",4:"d",5:"e",6:"f",7:"g",8:"h",9:"i",10:"j",11:"k",12:"l",13:"m",14:"n",15:"o",16:"p",17:"q",18:"r",19:"s",20:"t",21:"u"}
b=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
s=input()
singles=[]
multiple=[]
j=0
for i in s:
    singles.append(b[int(i)-1])
    print(s[j:j+2])
    multiple.append(b[int(s[j:j+2])])
    j+=1

print(singles)
for i in range(5):
    print("j")

