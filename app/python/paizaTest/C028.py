count = int(input())

i = 0
result = 0
while i < count:
    str = input().split()
    ans1 = str[0]
    ans2 = str[1]

    if len(ans1)!=len(ans2):
        result = result + 0
    else:
        j = 0
        ws = 0
        while j < len(ans1):
            if ans1[j] == ans2[j]:
                ws = ws + 0
            else:
                ws = ws + 1
            j += 1              
        if ws == 0:
            result = result +2
        elif ws == 1:
            result = result + 1
        else:
            result = result +0
    i += 1

print(result)
