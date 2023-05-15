package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class editor2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Character> queue = new LinkedList<>();
		
		String str = br.readLine();
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			queue.add(c);
		}
		
		int c_num = queue.size();  //커서가 뒤에서 첫번째 위치에 잇음
		
		while(num != 0) {
			String e = br.readLine();
			String[] edit = e.split(" ", 2);
			char temp[] = new char[queue.size()];
			switch(edit[0]) {
				case "L":
					if(c_num == 0) {
						break;
					}
					c_num--;
					break;
				case "D":
					if(c_num == queue.size()) {
						break;
					}
					c_num++;
					break;
				case "B":
					if(c_num == 0) {
						break;
					}
					for(int i=0; i<c_num; i++) {
						temp[i] = queue.poll(); //이렇게 하면 맨앞에있던게 뒤로 가서 안됨...
					}
					for(int i=0; i<c_num-1; i++) {
						queue.add(temp[i]);
					}
					c_num--;
					break;
				case "P":
					queue.add(edit[1].charAt(0));
					for(int i=c_num-1; i>=0; i--) {
						char a = queue.poll();
						queue.add(a);
					}
					break;
			}
			num--;
		}
		
		for(int i=queue.size()-1; i>=0; i--) {
			System.out.print(queue.poll());
		}

	}

}
