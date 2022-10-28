#include<iostream>
using namespace std;

int main(){
	int t; 
	cin>>t;
	while(t--){
		int n; cin>>n;
		int quo[n];
		for(int i = 1; i <= n; i++){
			quo[i] = n / i;
		}
		long long int sum = 0;
		for (int i = 1; i <= n; i++){
			sum += i * quo[i];
		}
		cout<<sum % (int)(1e9 + 7)<<endl;
	}
	return 0;
}

