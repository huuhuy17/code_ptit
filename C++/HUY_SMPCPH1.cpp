#include<iostream>

using namespace std;


int main(){
	int n, m; cin>>n;
	cin.ignore();
	string s1, s2[101];
	getline(cin, s1);
	cin>>m;
	for(int i = 0; i < m; i++){
//		cin.ignore();
		getline(cin, s2[i]);
		cin.ignore();
	}
	cout<<s1;
	for(int i = 0; i<m; i++){
		cout<<s2[i]<<" ";
	}
	return 0;
}
