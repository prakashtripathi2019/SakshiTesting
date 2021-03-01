package Practice.com;
class UnderAge extends Exception {
	UnderAge(){
		super("You are under Age");
	}
	UnderAge(String msg){
		super(msg);
	}
}
	public class Voting{
		public static void main(String[] args)  {
		UnderAge ua=new UnderAge();
	   try {
		int age=17;
		if(age<18) {
		   throw new UnderAge("Not eligible");
		}
		//else {
			//System.out.println("Eligible");
		}
		catch(UnderAge e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("exit");
		}
	}
	}


