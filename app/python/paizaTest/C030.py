str1 = input().split()
h = int(str1[0])
w = int(str1[1])

i = 0
data = []
result = []
while i < h:
    str2 = []
    str2 = input().split()
    j = 0
    while j < w:
        data.append(int(str2[j]))
        if data[i+j] >= 128:
            result.append(1)
        else:
            result.append(2)
        print(result[i+j])
        print(" ")
        j += 1
    print('¥n')
    i += 1
