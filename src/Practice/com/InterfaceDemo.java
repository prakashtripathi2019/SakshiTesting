package Practice.com;
  public  interface InterfaceDemo {
	 int x=10;
	 default void defaultMethod() {
	 System.out.println("Hello");
	 }
  
	public static void main(String[] args) {
		System.out.println(x);

	}

}
