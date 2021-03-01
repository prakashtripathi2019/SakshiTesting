package Practice.com;

class Test7{
	int x=10;
	void m1() {
		System.out.println(this.x);
		//System.out.println(super.x);
	}
}

public class ChectDatatypepfThisAnsSuper extends Test7{
  int x=20;
  void m2() {
	  System.out.println(this.x);
	  System.out.println(super.x);
  }

	public static void main(String[] args) {
		ChectDatatypepfThisAnsSuper cd=new ChectDatatypepfThisAnsSuper();
        cd.m1();
        cd.m2();
	}

}
