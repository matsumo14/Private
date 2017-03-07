def for_func(iterable, callback):
    it = iter(iterable)
    while True:
        try:
            v = next(it)
            callback(v)
        except StopIteration:
            break
def genOdd_func():
    i = 1
    while i <=30:
        yield i
        i +=2

nums = [1,2,3,4,5]
for_func(nums,lambda i : print(i))

it = genOdd_func()
for v in it:
    print(v)
