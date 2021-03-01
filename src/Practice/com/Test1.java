package Practice.com;

public class Test1 {
     public int m1(int num) {
    	 System.out.println("method 1");
    	 return num;
     }
     public void m1(int num,int p) {
    	 System.out.println("method 2");
     }
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1(10);
		t.m1(23,20);

	}

}
