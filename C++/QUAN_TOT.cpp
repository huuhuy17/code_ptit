#include<iostream>
#include<math.h>
using namespace std;

int Ban[9][8];

int T_row[3] = {1, 0, 0};
int T_col[3] = {0, 1, -1};

int A[2] = {3, 0};

struct QuanCo{
	int y, x;
	
	int distance(QuanCo o){
		return sqrt(pow(y - o.y, 2) + pow(x - o.x, 2));
	}
};

int main(){
	int y,x; cin>>y>>x;
	QuanCo T;
	T.y = y; T.x = x;
	
	QuanCo tot[4];
	int k = 0;
	for(int i = 0; i<5; i++){
		tot[i].y = 3;
	}
	
	for(int i = 0; i<=8; i+=2){
		tot[k++].x = i;
	}
	
	if(T.y >= 5){
		int min_dis = tot[0].distance(T);
		int key = 0;
		for(int i = 1; i<5; i++){
			int dis = tot[i].distance(T);
			if(dis < min_dis){
				min_dis = dis;
				key = i;
			}
		}
		cout<< min_dis <<" "<<key<<endl;
	}
	else {
		for(int i = 0; i < 5; i++){
			if(T.x == tot[i].x){
				cout<<i<<endl;
			}
		}
	}
	
	
	return 0;
}

