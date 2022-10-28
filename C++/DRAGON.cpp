#include<iostream>
using namespace std;

struct Dragon {
	int power, trophy;
	bool isDefeat;

};
int s, n;
Dragon arr[1003]{};
int countRemain() {
	int count = 0;
	for (int i = 0; i < n; i++) {
		if (arr[i].isDefeat == false) {
			count++;
		}
	}
	return count;
}

int main() {
	
	cin >> s >> n;
	
	for (int i = 0; i < n; i++) {
		cin >> arr[i].power >> arr[i].trophy;
		arr[i].isDefeat = false;
	}

	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (arr[i].trophy < arr[j].trophy || (arr[i].trophy == arr[j].trophy && arr[i].power > arr[j].power)) {
				Dragon tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	int count = 0;
	int countRemain = countRemain();
	while (true) {
		for (int i = 0; i < n; i++) {
				if (s >= arr[i].power) {
					arr[i].isDefeat = true;
					s += arr[i].trophy;
					count++;
				}
				else continue;
			}
		if (count > countRemain()) {
			count = countRemain();
		}
		else break;

	}
	
	if (count == n)  cout << "YES" << endl;
	else cout << "NO" << endl;

	return 0;
}
