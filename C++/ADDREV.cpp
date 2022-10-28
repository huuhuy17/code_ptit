#include<bits/stdc++.h>
#include<string.h>
using namespace std;

string so_nghich_dao(string a){
	reverse(a.begin(), a.end());
   	while(a[0]=='0') a.erase(0, 1);
    if (a[a.size()-1]=='-') a.erase(a.size()-1, 1);
    
    return a;
}
int si(string a){
	int x = 0;
    for (int i = 0; i< a.size(); i++){
    	x = x*10 + a[i] - '0';
	}
    return x;
}

string is(int a){
	string s = "";
	while(a){
		if(a%10)
		s = s + (char)(a%10 + '0');
		a /= 10;
	}
	return s;
}
int main(){
	int n; cin>>n;
	while(n){
		string a, b;
		cin>>a>>b;
		cout << is(si(so_nghich_dao(a)) + si(so_nghich_dao(b)))<<endl;
		n--;
	}
	
	return 0;
}
