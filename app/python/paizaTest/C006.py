str1 = input().split()
data = int(str1[0])
usr = int(str1[1])
top = int(str1[2])

str2 = input().split()

i = 0
c = []
while i < len(str2):
    c.append(float(str2[i]))
    i += 1

j = 0
result = []
while j < usr:
    str3 = input().split()
    k = 0
    total = 0
    while k < data:
        total = total + int(str3[k]) * float(c[k])
        k += 1
    result.append(int(total))
    j += 1

#sorted(result)
#print(result)
#print(result.sort(reverse = True))
#print(sorted(result,reverse = True))

result.sort(reverse = True)

l = 0
for l in range(top):
    print(int(result[l]))
    l += 1
