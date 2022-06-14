#include<bits/stdc++.h>
using namespace std;
struct TBNAM{
	string HoTen;
	string Lop;
	float DiemTB;
} ;


int main()
{
	cout<<"Nhap so sinh vien: ";
	int k;
	cin>>k;
	TBNAM DTB[k+1];
	string name;
	string lop;
	for(int i = 0; i < k; i++){
		cout<<"Nhap ho ten sinh vien thu "<<i+1<<": ";
		cin>>DTB[i].HoTen;
		cout<<endl;
		cout<<"Nhap lop sinh vien thu "<<i+1<<": ";
		cin>>DTB[i].Lop;
		cout<<endl;
		cout<<"Nhap diem trung binh sinh vien thu "<<i+1<<": ";
		cin>>DTB[k].DiemTB;
		cout<<endl;
	}
	printf("STT\t");
	printf("HO VA TEN\t\n");
	int vitri = 1;
	for(int i = 0; i < k; i++){
		if(DTB[k].DiemTB >= 8){
			printf("%3d\t", vitri++);
			cout<<DTB[k].HoTen<<endl;
		}
	}
	if(vitri == 1) vitri = 0;
	printf("TONG SO SINH VIEN LA: %d", vitri);
}
