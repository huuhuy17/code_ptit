#include<iostream>

using namespace std;

string decToBinary(int n)
{
	string res = "";
    int binaryNum[32] = {0};
 
    int i = 0;
    while (n > 0) {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
    }
 
    for (int j = 4; j >= 0; j--)
        res += binaryNum[j] + '0';
    return res;
}

int main() {
	int t; cin>>t;
	while(t--){
		int a[22][22];
	int row, col;
	cin >> row >> col;
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
    
	
	string s; cin>>s;
	string so = "";
	for(int Z = 0; Z < s.length(); Z++){
		if(s[Z] == ' ') so += " ";
		else{
			so += decToBinary(s[Z] - 'A' + 1);
		}
	}
	
	if(so.length() < row * col){
		for(int x = so.length(); x < row * col; x++) so += '0';
	}
	char arr[25][25];
	for (int z = 0; z < row; z++) {
		for (int t = 0; t < col; t++){
			arr[z][t] = (char) so[a[z][t]];
			cout << arr[z][t];
		}
	}
	}
	
}
