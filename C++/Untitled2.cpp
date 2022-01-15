#include<conio.h>
#include<stdio.h>
#include<math.h>
int main()
{	
	float a, b, c, P, S;
	printf("\n Nguyen Dinh Binh - 191968");
	printf("\n Nhap 3 so bat ky: "); 
	scanf("%f%f%f", &a,&b,&c);
	while (a<0 || b<0 || c<0){
		printf("Nhap sai! Nhap lai: "); 
		scanf("%f%f%f", &a,&b,&c);
	}
	if ((a+b>c) && (a+c>b) && (b+c>a)){
		printf("\n La do dai 3 canh cua tam giac\n");
		P = (a + b + c ) / 2;
		S = sqrt(P * (P - a) * (P - b) * (P-c));
		printf("Dien tich tam giac la: %f", S);
	}
	
	else
		printf("\n Khong la do dai 3 canh cua tam giac");
	getch();
}
