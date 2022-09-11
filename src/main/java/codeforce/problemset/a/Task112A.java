package codeforce.problemset.a;

import java.util.Scanner;

public class Task112A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String s1 = in.next();
//		String s2 = in.next();
//		String s1 = "ttXjenUAlfixytHEOrPkgXmkKTSGYuyVXGIHYmWWYGlBYpHkujueqBSgjLguSgiMGJWATIGEUjjAjKXdMiVbHozZUmqQtFrT";
//		String s2 = "JziDBFBDmDJCcGqFsQwDFBYdOidLxxhBCtScznnDgnsiStlWFnEXQrJxqTXKPxZyIGfLIToETKWZBPUIBmLeImrlSBWCkTNo";
		String s1 = "aslkjlkasdd";
		String s2 = "asdlkjdajwi";

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
				}
				if(s2s[i] > s2s[j]){
					char tmp = s2s[i];
					s2s[i] = s2s[j];
					s2s[j] = tmp;
				}
			}
		}
		System.out.println(s1s);
		System.out.println(s2s);

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
