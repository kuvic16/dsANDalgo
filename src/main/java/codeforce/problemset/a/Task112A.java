package codeforce.problemset.a;

import java.util.Scanner;

public class Task112A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		
		int s1sum = 0, s2sum = 0;
		for(int c : s1.toLowerCase().toCharArray()) {
			s1sum += c;
		}
		//System.out.println(s1sum);
		
		for(int c : s2.toLowerCase().toCharArray()) {
			s2sum += c;
		}
		//System.out.println(s2sum);
		
		String result = "";
		if(s1sum < s2sum) result = "-1";
		else if(s1sum == s2sum) result = "0";
		else result = "1";
		
		System.out.println(result);
	}
}
