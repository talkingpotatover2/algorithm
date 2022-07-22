package com.baekjoon;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		
		//출력횟수 입력받기
		int num = sc.nextInt();
		while(num > 0) {
			String str = sc.next();
			switch(str) {
				case "push_front": 
					int X = sc.nextInt();
					deque.addFirst(X);
					break;
				case "push_back":
					X = sc.nextInt();
					deque.addLast(X);
					break;
				case "pop_front":
					if(deque.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(deque.peekFirst());
						deque.removeFirst();
					}
					break;
				case "pop_back":
					if(deque.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(deque.peekLast());
						deque.removeLast();
					}
					break;
				case "size":
					System.out.println(deque.size());
					break;
				case "empty":
					if(deque.size() == 0) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
				case "front":
					if(deque.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(deque.peekFirst());
					}
					break;
				case "back":
					if(deque.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(deque.peekLast());
					}
			}
			num--;
		}
	}

}
