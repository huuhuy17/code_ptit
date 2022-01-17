def is_thuan_nghich(n):
    arr = [int(i) for i in n]
    arr1 = arr[::-1]
    check_TN = False
    check_cs = True
    check_tongCS = False
    if arr == arr1:
        check_TN = True

    for i in arr:
        if i % 2 != 0:
            check_cs = False
            break

    tongCS = sum(arr)
    if tongCS % 2 == 0:
        check_tongCS = True
    if check_cs and check_TN and check_tongCS:
        return True
    return False


if __name__ == '__main__':
    t = int(input())
    while t:
        n = int(input())
        for i in range(22, n):
            if is_thuan_nghich(str(i)):
                print(i, end=" ")

        print()
        t -= 1
