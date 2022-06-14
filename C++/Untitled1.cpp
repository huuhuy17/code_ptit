#include <stdio.h>
#include <conio.h>
#include <string.h>
typedef struct
{
    char masv[20];
    char hoten[30];
    int namsinh;
    float diem;
} sinhvien;
void nhap1sv(sinhvien *s)
{
    printf("\nNhap ma sinh vien: ");
    scanf("%s", &s->masv);
    fflush(stdin);
    printf("\nNhap ho ten: ");
    gets(s->hoten);
    printf("\nNhap nam sinh: ");
    scanf("%d", &s->namsinh);
    printf("\nNhap diem trung binh: ");
    scanf("%f", &s->diem);
}
void xuat1sv(sinhvien s)
{
    printf("\n%30s|%20s|%9d|%8.1f", s.masv, s.hoten, s.namsinh, s.diem);
}
void nhapsv(sinhvien sv[], int n)
{
    for (int i = 0; i < n; i++)
        nhap1sv(&sv[i]);
}

void xuatsv(sinhvien sv[], int n)
{
    printf("\n%30s|%20s|%9s|%8s", "MaSV", "Hoten", "Namsinh", "Diem");
    for (int i = 0; i < n; i++)
        xuat1sv(sv[i]);
}
void diemmax(sinhvien sv[], int n)
{
    int max = 0;
    for (int i = 1; i < n; i++)
    {
        if (sv[i].diem > max)
        {
            xuat1sv(sv[i]);
        }
    }
}

void timsv_masv(sinhvien sv[], int n) // n la so sinh vien
{
    char masv[7];
    printf("\nNhap ma sv can tim : ");
    scanf("%s", masv);
    printf("\n%30s|%20s|%9s|%8s", "MaSV", "Hoten", "Namsinh", "Diem");
    int flag = 0;
    for (int i = 0; i < n; i++)
    {
        if (strcmp(masv, sv[i].masv) == 0)
        {
            xuat1sv(sv[i]);
            flag = 1;
        }
    }
    if (flag == 0)
    {
        printf("\nKhong co sinh vien nao co ma can tim ");
    }
}

void menu()
{
    printf("\n--------------Menu------------\n");
    printf("\n1. Nhap so sinh vien ");
    printf("\n2. Xuat sinh vien ");
    printf("\n3. Dua ra sinh vien co diem cao nhat ");
    printf("\n4. Tim sinh vien bang ma");
    printf("\n0. Thoat");
}
int main()
{
    sinhvien sv[50];
    int n, chon;
    while (true)
    {
        menu();
        printf("\nMoi ban chon: ");
        scanf("%d", &chon);
        switch (chon)
        {
        case 1:
            printf("\n");
            do
            {
                printf("\nNhap so luong sv= ");
                scanf("%d", &n);
                if (n < 1 || n > 50)
                    printf("\nMoi ban nhap lai");
            } while (n < 1 || n > 50);
            nhapsv(sv, n);
            break;
        case 2:
            xuatsv(sv, n);
            break;
        case 3:
            diemmax(sv, n);
            break;
        case 4:
            timsv_masv(sv, n);
            break;
        case 0:
            return 0;
            break;
        }
    }
}