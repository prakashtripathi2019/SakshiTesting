package Practice.com;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		map.put("abc", 1);
		map.put("bcd",2);
		map.put("xyz", 3);
		map.put("pqr", 4);
		map.put("stv", 5);
		System.out.println(map.size());
		System.out.println(map);

	}

}
