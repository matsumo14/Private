str1 = input().split()
alld = int(str1[0])
tripd = int(str1[1])
day = []
num = []

i = 0
str2 = []
while i < alld:
    str2.append(input().split())
    day.append(int(str2[i][0]))
    num.append(int(str2[i][1]))
    i += 1

print(str2)
print(str2[0])
print(str2[0][0])


j = 0
av = {}
while j < alld - tripd:
    k = 0
    sum = 0
    while k < tripd:
        sum = sum + num[j+k]
        lastd = day[j+k]
        k += 1
    av[lastd] = sum / tripd
    j += 1

result = sorted(av.items(), key = lambda av : av[1])
ld = result[0][0]
fd = ld - tripd + 1

print(str(fd)+ " " + str(ld))
