package Practice.com;
//import java.util.Scanner;
public class Test2 {
	public boolean isPalendrom(int number) {
		int n=number;
		int rev=0;
		int k;
	    while(number!=0){
	    	k=number%10;
	    	rev=rev*10+k;
	    	number=number/10;
	    }
		System.out.println(rev);
		if(n==rev) { 
			return true;
		}
		else {
			return false;
	}
	}

	public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
		Test2 t=new Test2();
		System.out.println(t.isPalendrom(1221));
		
	}
}


