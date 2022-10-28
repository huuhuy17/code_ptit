#include<iostream>
using namespace std;
int main(){
	int n ;cin>>n;
	int arr[n+1][n+1];
	int a= 0, b=0, c= 0, d= 0;
	for (int i = 0; i < n; i++){
		for (int j = 0; j< n; j++){
			cin>>arr[i][j];
			if(i < j) a+= arr[i][j];
			if (i > j) b+= arr[i][j];
			if(j < n-1-i) c+= arr[i][j];
			if (j > n-1-i) d += arr[i][j];
		}
	}

	cout<<a<<endl;
	cout<<b<<endl;
	cout<<c<<endl;
	cout<<d<<endl;
	return 0;
}
