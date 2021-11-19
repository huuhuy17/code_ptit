s = input()
a = []
l = len(s)
if(l%2!=0):
    l = l - 1
for i in range(0,l,2):
    a.append(s[i]+s[i+1])
b = dict.fromkeys(a)
for i in b:
    print(int(i),a.count(i))
