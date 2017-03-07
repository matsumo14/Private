line_size = int(input())

i = 0
row = []
while i < line_size:
    line = int(input())
    row.append(line)
    if row[i] % 400 != 0 and row[i] % 100 == 0:
        print(str(row[i]) + " is not a leap year")
    elif row[i] % 4 == 0:
        print(str(row[i]) + " is a leap year")
    else:
        print(str(row[i]) + " is not a leap year")
    i += 1
