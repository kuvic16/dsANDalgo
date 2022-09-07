package codeforce.problemset.a;

import java.util.Scanner;

public class Task1726A {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] r = new int[n];
		for(int i=0; i<n; i++) {
			int m = in.nextInt();
			int max = 0, min = 0;
			for(int j=0; j<m; j++) {
				int k = in.nextInt();
				if(j == 0) {
					min = k;
					max = k;
				}else if(k < min) min = k;
				else if(k > max) max = k;
			}
			int result = max - min;
			//if(m == 1) result = 0;
			r[i] = result;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(r[i]);
		}
	}
}
