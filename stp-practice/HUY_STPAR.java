import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class HUY_STPAR {
	static Queue<Integer> queue;
	static Stack<Integer> stack;
	static int n;
	static int count;
	static boolean check;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		n = Integer.parseInt(stringTokenizer.nextToken());
		while (n != 0) {
			check = true;
			count = 1;
			queue = new LinkedList<>();
			stack = new Stack<>();
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int i = 0; i < n; i++) {
				int x = Integer.parseInt(stringTokenizer.nextToken());
				queue.add(x);
			}
			while (true) {
				if (stack.isEmpty() && !queue.isEmpty()) {
					if (queue.peek() != count) {
						int x = queue.poll();
						stack.add(x);
					}
					else if(queue.peek() == count) {
						int x = queue.poll();
						count++;
					}
				} else if (!stack.isEmpty() && !queue.isEmpty()) {
				 if (queue.peek() != count && stack.peek() != count) {
						int x = queue.poll();
						stack.add(x);
					} else if (queue.peek() != count && stack.peek() == count) {
						int x = stack.pop();
						count++;
					} else if (queue.peek() == count) {
						int x = queue.poll();
						count++;
					}

				} else if(!stack.isEmpty() && queue.isEmpty()) {
					if(stack.peek() == count) {
						int x = stack.pop();
						count++;
					}
					else if(stack.peek() != count) {
						check = false;
						break;
					}
				}else {
					// ca 2 cung het
					break;
				}
			}
			if(check) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			n = Integer.parseInt(stringTokenizer.nextToken());
		}
	}
}