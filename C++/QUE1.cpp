#include<iostream>
using namespace std;

struct Person{
	int h, t;
};

bool cmp(Person a, Person b)
{
    if(a.t == b.t) return a.h < b.h;
    return a.t > b.t;
}

int main(){
	int t; cin>>t;
	while(t--){
		int n; cin>>n;
		Person arr[n];
		for(int i = 0; i < n; i++){
			cin>>arr[i].h;
		}
		
		
		
		for(int i = 0; i < n; i++){
			cin>>arr[i].t;
		}
		
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[i].h > arr[j].h){
					Person tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		int res[n];
		for(int i = 0; i < n; i++){
			res[i] = -1;
		}
		int j, temp, count;
		for(int i = 0; i < n; i++){
			temp = arr[i].t;
			j = count = 0;
			if(temp == 0){
				for(j = 0; j < n; j++){
					if(res[j] == -1) break;
				}
				res[j] = arr[i].h;
			}
			else {
				for(j = 0; j < n; j++){
					if(res[j] == -1) count++;
					if(count == temp && res[j+1] == -1) break;
				}
				res[j+1] = arr[i].h;
			}
		}
		for(int i = 0; i < n; i++){
			cout<<res[i]<<" ";
		}
	}
	
	return 0;
}
