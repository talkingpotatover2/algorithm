package com.baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Josephus {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		//(n,k)
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		//����� ������� �־���
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		System.out.print("<");
		while(queue.size() != 0) {
			//k*i-1������� ��������
			for(int i=0; i<k-1; i++) {
				int temp = queue.get(0);
				queue.remove();
				queue.add(temp);
			}
			if(queue.size()==1) {
				System.out.print(queue.get(0));
			}else {
				System.out.print(queue.get(0)+", ");
			}
			queue.remove();
		}
		System.out.println(">");
	}

}
