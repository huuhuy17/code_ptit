class SinhVien:
    def __init__(self, hoten, CC, KTTX, BTL, HK):
        self.hoten = hoten
        self.CC = CC
        self.KTTX = KTTX
        self.BTL = BTL
        self.HK = HK

    def tongDiem(self):
        tongdiem = self.CC * 0.1 + self.KTTX * 0.1 + self.BTL * 0.2 + self.HK * 0.6
        return tongdiem

    def diemChu(self):
        tongdiem = self.tongDiem()
        if tongdiem < 4:
            return "F"
        elif 4 <= tongdiem < 5.5:
            return "D"
        elif 5.5 <= tongdiem < 7:
            return "C"
        elif 7 <= tongdiem < 8.5:
            return "B"
        elif 8.5 <= tongdiem <= 10:
            return "A"

    def xepLoai(self):
        tongdiem = self.tongDiem()
        if tongdiem < 4:
            return "Kém"
        elif 4 <= tongdiem < 5.5:
            return "Trung bình kém"
        elif 5.5 <= tongdiem < 7:
            return "Trung bình"
        elif 7 <= tongdiem < 8.5:
            return "Khá"
        elif 8.5 <= tongdiem <= 10:
            return "Giỏi"


if __name__ == '__main__':
    hoten = input()
    CC = float(input())
    KTTX = float(input())
    BTL = float(input())
    HK = float(input())
    sinhvien = SinhVien(hoten, CC, KTTX, BTL, HK)
    print(sinhvien.hoten)
    print(sinhvien.diemChu())
    print(sinhvien.xepLoai())
