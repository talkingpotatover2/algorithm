package com.baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=0) {
			String str = sc.next();
			switch(str) {
				case "push":
					int num = sc.nextInt();
					queue.add(num);
					break;
				case "pop":
					if(queue.size() != 0) {
						System.out.println(queue.get(0));
						queue.remove();
					}else {
						System.out.println(-1);
					}
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					if(queue.size() != 0) {
						System.out.println(0);
					} else {
						System.out.println(1);
					}
					break;
				case "front":
					if(queue.size() != 0) {
						System.out.println(queue.get(0));
					}else {
						System.out.println(-1);
					}
					break;
				case "back":
					if(queue.size() != 0) {
						System.out.println(queue.get(queue.size()-1));
					}else {
						System.out.println(-1);
					}
					break;
			}
			
			
			n--;
		}
	}

}
