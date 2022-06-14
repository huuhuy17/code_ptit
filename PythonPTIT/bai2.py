

if __name__ == '__main__':
    print("Nhập n: ", end="")
    n = int(input())
    arr = []
    for i in range(n):
        arr.append(input())
    print("Dãy số vừa nhập theo thứ tự ngược:")
    for i in arr[::-1]:
        print(i, end=" ")
    res = [int(i) for i in arr]
    print()
    print("Nhập x: ", end="")
    x = int(input())
    dem = 0
    tong = 0
    so_chan = 0
    for i in res:
        if i % 2 == 0:
            so_chan = so_chan + 1
            tong += i
        if i == x:
            dem = dem + 1
    print("Số lần xuất hiện của x: ", end="")
    print(dem)
    print("Giá trị trung bình các số chẵn là: ", end="")
    print(tong/so_chan)

