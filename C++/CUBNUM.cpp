#include<iostream>
#include <math.h>
#include <string.h>
using namespace std;

int progress(int n) {
	int count = 0;
	int m = n;
	for (int i = (int)cbrt(n); i >= 1; i--) {
		while (m >= pow(i, 3)) {
			m -= pow(i, 3);
			count++;
		}
		if (m == 0) break;
	}	
	return count;
}

int main() {
	string s;
	int t = 1;
	while (true) {
		cin>>s;
		if(s == "EOF") break;
		else{
			int n = 0;
			for(int i = 0; i < s.length(); i++){
				n = n*10 + s[i] - '0';
			}
			cout << "Case #" << t << ": "<<  progress(n) << endl;
			t++;
		}
		
	}
	return 0;
}
