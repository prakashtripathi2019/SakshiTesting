package Practice.com;

 abstract class Test3 {
	public abstract void m1();
    public void m2() {
		System.out.println("M2 Method");
    }
	Test3(){
		System.out.println("Constructor");
	}
}
public class Abstractclass extends Test3{
	Abstractclass(){
		super();
	}
	public void m1() {
		System.out.println("M1() method");
	}
	
	public static void main(String[] args) {
		Abstractclass ac=new Abstractclass();
		ac.m1();
		ac.m2();
		
	}

}
  
