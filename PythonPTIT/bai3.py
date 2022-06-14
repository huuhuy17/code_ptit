class Oto:
    def __init__(self, ma, thuonghieu):
        self.ma = ma
        self.thuongHieu = thuonghieu

    def nhap(self):
        self.ma = input("Nhập mã xe: ")
        self.thuongHieu = input("Nhập thương hiệu: ")

    def __str__(self):
        return str("Xe mã: " + str(self.ma) + ", thương hiệu: " + str(self.thuongHieu))


if __name__ == '__main__':
    A = []
    B = []
    ds_ma_xe = []
    ds_thuong_hieu = []
    ds_thuong_hieu_A = []
    ds_thuong_hieu_B = []
    a_i = 1
    b_i = 1
    while True:
        print("Nhập thông tin bán xe của showroom A(Nhập # để hoàn tất)")
        print("Xe thứ " + str(a_i) + ": ")
        print("Nhập mã xe: ", end="")
        ma = input()
        if ma != '#':
            if ma in ds_ma_xe:
                print("Mã xe trùng!!!")
            else:
                ds_ma_xe.append(ma)
                print("Nhập thương hiệu: ", end="")
                th = input()
                ds_thuong_hieu_A.append(th)
                tmp = Oto(ma, th)
                A.append(tmp)
                a_i += 1
        else:
            break

    while True:
        print("Nhập thông tin bán xe của showroom B(Nhập # để hoàn tất)")
        print("Xe thứ " + str(b_i) + ": ")
        print("Nhập mã xe: ", end="")
        ma = input()
        if ma != '#':
            if ma in ds_ma_xe:
                print("Mã xe trùng!!!")
            else:
                ds_ma_xe.append(ma)
                print("Nhập thương hiệu: ", end="")
                th = input()
                ds_thuong_hieu_B.append(th)
                tmp = Oto(ma, th)
                B.append(tmp)
                b_i += 1
        else:
            break
    print(ds_ma_xe)
    ds_thuong_hieu = set(ds_thuong_hieu_A + ds_thuong_hieu_B)
    print("Số thương hiệu xe khác nhau đã bán của showroom A là: ", len(set(ds_thuong_hieu_A)))
    print("Số thương hiệu xe khác nhau đã bán của showroom B là: ", len(set(ds_thuong_hieu_B)))

    for i in ds_thuong_hieu:
        dem_xe = 0
        for j in A+B:
            if i == j.thuongHieu:
                dem_xe += 1
        print("Số lượng xe của thương hiệu " + str(i) + " đã bán được bởi 2 showroom là: " + str(dem_xe))
