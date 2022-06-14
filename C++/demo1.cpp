#include<bits/stdc++.h>
using namespace std;
int main()
{
	int k;
	cin>>k;
	while(k < 4 || k > 60){
		cin>>k;
	}
	int X[k+1];
	for(int i = 0; i < k; i++){
		cin>>X[i];
	}
	
	int dem = 0;
	for(int i = 0; i < k; i++){
		if(X[i] > 10 && X[i] % 3 == 0){
			dem++;
		}
		printf("%5d ", X[i]);
	}
	
	cout<<"\nSO CAC SO DEM DUOC LA: "<<dem<<endl;
	
	return 0;	
}
