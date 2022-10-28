
#include <iostream>
using namespace std;

int main() {
	int T; cin>>T;
	while(T--){
		int n;
		cin>>n;
		int a[n+5];
		int max = 0, id_max = 0;
		for(int i = 0; i<n; i++){
			cin>>a[i];
			if(a[i] > max) {
				max = a[i];
				id_max = i;
			}
		}
		int nuoc = 0;
		for (int i = 0; i < id_max; i++){
			if (a[i] > a[i+1]) {
				nuoc += a[i] - a[i+1];
				a[i+1] = a[i];
			}
		}
		for (int i = n-1; i > id_max; i--){
			if (a[i] > a[i-1]){
				nuoc += a[i] - a[i-1];
				a[i-1] = a[i];
			}
		}
		cout<<nuoc<<endl;
		
	}

	return 0;
}
