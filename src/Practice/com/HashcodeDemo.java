package Practice.com;

import java.util.HashMap;
import java.util.Map;

public class HashcodeDemo {

	public static void main(String[] args) {
		Test5 t1=new Test5(1);
		Test5 t2=new Test5(1);
		Map<Test5,String> map =new HashMap<>();
		map.put(t1,"sakshi");
		map.put(t2,"Sakshi");
		System.out.println(map.size());
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		Map<Integer,String> map1 =new HashMap<>();
		map1.put(i1, "Tripathi");
		map1.put(i2,"Tripathi");
		System.out.println(map1.size());
	}

}
class Test5{
	int id;
	public Test5(int id){
		this.id=id;
	}
}