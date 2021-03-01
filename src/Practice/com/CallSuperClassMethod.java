package Practice.com;

 class Test6{
	int a=10;
	public void m1() {
		System.out.println("m1 method");
		this.a=20;
		System.out.println(a);
	}

}
 class CallSuperClassMethod extends Test6{
    	//super.a=40; Copile time errorss
	 
	public void m2() {
		super.m1(); //call super class method
		super.a=30;//call super class variable and reinitialize 
		System.out.println("m2 method");
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		CallSuperClassMethod ccm=new CallSuperClassMethod();
		ccm.m2(); 
	}
}
