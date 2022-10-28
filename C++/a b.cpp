#include<iostream>
#include<string>
using namespace std;

int main(){
	int T;
	cin>>T;
	cin.ignore();
	while(T){
		string s;
  		getline(cin, s);
  		int dem = 0;
  		for (int i = 0; i<s.length()-1; i++){
  			if(s[i] == ' ' && s[i+1] != ' ') dem++;
		  }
  		cout<<dem<<endl;
		T--;
	}
    
    return 0;
}

