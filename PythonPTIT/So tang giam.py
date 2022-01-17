def is_Up(arr):
    check = True
    for i in range(0, len(arr) - 1):
        if arr[i] >= arr[i+1]:
            check = False
            break
    return check


def is_Down(arr):
    check = True
    for i in range(0, len(arr) - 1):
        if arr[i] <= arr[i + 1]:
            check = False
            break
    return check


def soTangGiam(n):
    arr = []
    so_chu_so = 0
    n1 = n
    while n1:
        arr.append(n1 % 10)
        n1 /= 10
        so_chu_so += 1

    check = False
    for i in range(1, len(arr)):
        if is_Up(arr[0:i]) and is_Down(arr[i: len(arr)]):
            check = True
            break

    if check and so_chu_so > 2:
        return True
    else:
        return False


if __name__ == '__main__':
    n = int(input())
    while n:
        t = int(input())
        if soTangGiam(t):
            print("YES")
        else:
            print("NO")
        n -= 1
