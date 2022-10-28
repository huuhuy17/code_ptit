#include<iostream>
using namespace std;

int main(){
	int n ;
	cin>>n;
	string s;
	cin>>s;
	int len = s.length();
	int m = max(len/n, n);
	char a[m][m] = {""};
	int k = 0;
	for(int i = 0; i < len/n; i++){
		for(int j = 0; j < n; j++){
			if(i % 2 == 1) a[i][n-1-j] = s[k++];
			if(i % 2 == 0) a[i][j] = s[k++];
		}
	}
	
	for(int i = 0; i < m; i++){
		for(int j = 0; j<m; j++){
			cout<<a[j][i];
		}
	}
	return 0;
}
