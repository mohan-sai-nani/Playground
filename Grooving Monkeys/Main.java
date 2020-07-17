def shuffle(arr, key):
    temp = ['A']*len(key)
    for i in range(len(key)):
        temp[key[i] - 1] = arr[i]
    return temp

testcases = int(input())
for _ in range(testcases):
    num_of_monkeys = int(input())
    pattern = list(map(int, input().split()))
    original = [i for i in range(num_of_monkeys)]
    ref = shuffle(original, pattern)
    count = 1
    while original != ref:
        count += 1
        ref = shuffle(ref, pattern)
    print(count)