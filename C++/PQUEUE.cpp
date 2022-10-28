#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int max(vector<int> a) {
	int max = abs(a[0]);
	for (int i = 1; i < a.size(); i++) {
		if (abs(a[i]) > max) max = abs(a[i]);
	}
	return max;
}

int main() {
	int t; cin >> t;
	while (t--) {
		int n, m; cin >> n >> m;
		vector<int> a;
		for (int i = 0; i < n; i++) {
			int x; cin >> x;
			a.push_back(x);
		}
		a[m] = -a[m];
		int val = a[m];
		int len = a.size();
		int numPrint = 0;
		while (true) {
			if (abs(a[0]) < max(a)) {
				int tmp = a[0];
				for (int i = 0; i < len - 1; i++) {
					a[i] = a[i + 1];
				}
				a[len - 1] = tmp;
			}
			else if (abs(a[0]) == max(a) && a[0] != val) {
				for (int i = 0; i < len - 1; i++) {
					a[i] = a[i + 1];
				}
				len--;
				numPrint++;
			}
			else if (abs(val) == max(a) && val == a[0]) {
				numPrint++;
				break;
			}
		}
		cout << numPrint << endl;

	}
	return 0;
}
