import java.util.Arrays;
import java.util.Scanner;

public class HUY_QUE1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Person[] arr = new Person[n];
			int mang[] = new int[n];
			int pos[] = new int[n];
			for(int i = 0; i < n; i++) {
				mang[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				pos[i] = sc.nextInt();
			}
			
			for(int i = 0; i < n; i++) {
				Person tmp = new Person();
				tmp.setHeight(mang[i]);
				tmp.setTaller(pos[i]);
				arr[i] = tmp;
			}
			
			Arrays.sort(arr);
			
			int res[] = new int[n];
			for(int i = 0; i < n; i++) {
				res[i] = -1;
			}
			int count, j, tmp;
			for(int i = 0; i < n; i++) {
				tmp = arr[i].taller;
				j = count = 0;
				
				if(tmp == 0) {
					for(j = 0; j < n; j++) {
						if(res[j] == -1) break; 
					}
					res[j] = arr[i].height;
				}
				else {
					for(j = 0; j < n - 1; j++) {
						if(res[j] == -1) count++;
						if(count == tmp && res[j+1] == -1) break;
					}
					res[j+1] = arr[i].height;
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
		}
		sc.close();
	}
}

class Person  implements Comparable<Person> {
	int height;
	int taller;

	public int getTaller() {
		return taller;
	}

	public void setTaller(int taller) {
		this.taller = taller;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person o) {
		return this.height - o.height;
	}
	
}