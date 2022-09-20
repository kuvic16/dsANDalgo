package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task112A {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task112A.txt");
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(file);
		String s1 = in.next();
		String s2 = in.next();


		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] s1s = s1.toCharArray();
		char[] s2s = s2.toCharArray();

		for(int i=0; i<s1s.length; i++){
			for(int j=i+1; j<s1s.length; j++){
				if(s1s[i] > s1s[j]){
					char tmp = s1s[i];
					s1s[i] = s1s[j];
					s1s[j] = tmp;
				}else if(s1s[i] == s1s[j]){
					s1s[j] = '$';
				}
				if(s2s[i] > s2s[j]){
					char tmp = s2s[i];
					s2s[i] = s2s[j];
					s2s[j] = tmp;
				}else if(s2s[i] == s2s[j]){
					s2s[j] = '$';
				}
			}
		}
		System.out.println(s1s);
		System.out.println(s2s);

//		String result = "0";

//		int s1value = 0, s2value = 0, s1prev = 0, s2prev = 0;
//		for(int i=0; i<s1s.length; i++){
//			if(s1s[i] != s1prev) s1value += s1s[i];
//			if(s2s[i] != s2prev) s2value += s2s[i];
//			s1prev = s1s[i];
//			s2prev = s2s[i];
//		}
//
//		for(int i=0; i<s1s.length; i++){
//			System.out.print((int)s1s[i] + " ");
//		}
//		System.out.println();
//		for(int i=0; i<s1s.length; i++){
//			System.out.print((int)s2s[i] + " ");
//		}
//
//		System.out.println();
//		System.out.println(s1value);
//		System.out.println(s2value);
//		if(s1value > s2value) result = "1";
//		else if(s1value < s2value) result="-1";

		String result = "0";
		for(int i=0; i<s1s.length; i++){
			if((int)s1s[i] > (int)s2s[i]){
				result = "1";
				break;
			}
			else if((int)s1s[i] < (int)s2s[i]){
				result = "-1";
				break;
			}
		}
		
		System.out.println(result);
	}
}
