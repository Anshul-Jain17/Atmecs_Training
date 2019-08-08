package assignment_08_05_19;
import java.util.*;
class HashMapString{
	Map<String,String> obj;
	
	public HashMapString() {
		obj = new HashMap<String, String>();
	}
	public void addData(String key,String value) {
		obj.put(key,value);
	}
	
	public void iterateMap() {
		Set<String> keySet = obj.keySet();
		for(String key : keySet) {
			System.out.println(key+" , "+obj.get(key));
		}
	}
}

public class Question9 {
	public static void main(String[] args) {
		HashMapString hm = new HashMapString();
		hm.addData("Ajay", "90%");
		hm.iterateMap();
	}
}
