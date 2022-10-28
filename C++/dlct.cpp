#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int a[n+5], b[n+5];
	int sumTime1 = 0, sumTime2 = 0;
	bool check1=1, check2=1;
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
		if (a[i] == 0) check1 = 0;
		sumTime1 += a[i];
	}
	for (int i = 0; i < n; i++)
	{
		cin >> b[i];
		if (b[i] == 0) check2 = 0;
		sumTime2 += b[i];
	}
	if (check1 == 0) cout << 2 << endl;
	if (check2 == 0) cout << 1 << endl;
	if (check1 && check2) {
		if (sumTime1 < sumTime2) cout << 1 << endl;
		else if (sumTime1 > sumTime2) cout << 2 << endl;
		else cout << "Double Win" << endl;
	}


	return 0;
}
