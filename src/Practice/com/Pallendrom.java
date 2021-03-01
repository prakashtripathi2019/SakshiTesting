package Practice.com;

import java.util.Scanner;

public class Pallendrom {
	static boolean isPalindrom(String str) {
		int i=0,j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j))
			return false;
		i++;
		j--;
		}
	return true;
	
	}
	

	public static void main(String[] args) {
		String str="papa";
		if(isPalindrom(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
