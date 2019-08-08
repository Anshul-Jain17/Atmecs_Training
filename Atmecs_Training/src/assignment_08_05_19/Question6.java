package assignment_08_05_19;
import java.util.*;
class HashMapInitialization{
	Map<String,Integer> obj;
	
	public void initMap() {
		obj = new HashMap<String,Integer>(2);
		obj.put("english",85);
		obj.put("maths",90);
		obj.put("science",80);
	}
	
	public void iterateMap() {
		Set<String> keyset = obj.keySet();
		for(String key:keyset) {
			System.out.println(key+" , "+obj.get(key));
		}
	}
}

public class Question6 {
	public static void main(String[] args) {
		HashMapInitialization hm = new HashMapInitialization();
		hm.initMap();
		hm.iterateMap();
	}
}
