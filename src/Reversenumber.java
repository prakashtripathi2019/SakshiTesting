
public class Reversenumber {
	public void numberToWords(int number) {
		int rev;
		int n=0;
		while (number>0){
			rev=number%10;
			n=n*10+rev;
			number=number/10;
			
			switch(rev) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
			case 4:
				System.out.println("Four");
				
			}
			
		} 
		System.out.println(n);
		
	}
	public void OriginalValue(int number) {
		System.out.println(number);
	}
	
public static void main (String[] args) {
Reversenumber rs=new Reversenumber();
rs.numberToWords(1234);
rs.OriginalValue(1234);

}
}