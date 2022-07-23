package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class WordReverse2 {
	//https://1-7171771.tistory.com/27
	static void print(Stack st) {
		while(!st.empty()) {
			System.out.print(st.pop());
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();  //´Ü¾î ³Ö¾îÁÙ ½ºÅÃ
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		boolean check = false;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == '<') {
				check = true;
				print(st);
				System.out.print(c);
			}else if(c == '>') {
				check = false;
				System.out.print(c);
			}else if (check){
				System.out.print(c);
			}else {
				if(c == ' ') {
					print(st);
					System.out.print(c);
				}else {
					st.push(c);
				}
			}
		}
		print(st);
	}

}
