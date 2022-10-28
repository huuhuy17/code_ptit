#include<iostream>

using namespace std;

int main() {
	int row, col;
	cin >> row >> col;
	int a[row][col];
	int value=0,hangTren=0,hangDuoi=row-1,cotTrai=0,cotPhai=col-1;
	while(value<row*col)
		{
		  for(int i=cotTrai;(i<=cotPhai)&&(value<=row*col);i++,value++)
			 a[hangTren][i]=value;

		  hangTren++;

		  for(int j=hangTren;(j<=hangDuoi)&&(value<=row*col);j++,value++)
			 a[j][cotPhai]=value;
		  cotPhai--;

		  for(int k=cotPhai;(k>=cotTrai)&&(value<=row*col);k--,value++)
			 a[hangDuoi][k]=value;
		  hangDuoi--;

		  for(int h=hangDuoi;(h>=hangTren)&&(value<=row*col);h--,value++)
			 a[h][cotTrai]=value;
		  cotTrai++;
		}
		
	for(int i = 0; i < row; i++){
		for(int j = 0; j < col; j++)
			cout << a[i][j] << " ";
		cout << endl;
	}
}
