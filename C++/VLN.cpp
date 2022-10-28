#include<iostream>
#include<vector>
using namespace std;

long long int tong(vector<int> a, int x, int y) {
	long long int s = 0;
	for (int i = x; i < x + y; i++) {
		s += a[i];
	}
	return s;
}
int main() {
	int n, H;
	cin >> n >> H;
	vector<int> a;
	for (int i = 1; i <= n; i++) {
		int x; cin >> x;
		a.push_back(x);
	}
	long long int res = 0;
	for (int i = 1; i <= n - H; i++) {
		long long int s = tong(a, i, H);
		if (s > res) res = s;
	}
	cout << res << endl;
	
	return 0;
}
