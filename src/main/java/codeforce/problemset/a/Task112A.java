package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task112A {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task112A.txt");
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(file);
		String s1 = in.next().toLowerCase();
		String s2 = in.next().toLowerCase();

		int result = s1.compareTo(s2);
		if(result > 0) result = 1;
		else if(result < 0) result = -1;

		System.out.println(result);
	}
}
