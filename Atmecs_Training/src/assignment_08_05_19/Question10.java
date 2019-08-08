package assignment_08_05_19;
import java.util.*;
class HashMapSize{
	Map<String,String> obj;
	
	public HashMapSize() {
		obj = new HashMap<String, String>();
	}
	public void addData(String key,String value) {
		obj.put(key,value);
	}
	
	public void getSize() {
		System.out.println(obj.size());
	}
}

public class Question10 {
	public static void main(String[] args) {
		HashMapSize hm = new HashMapSize();
		hm.addData("Ajay", "90%");
		hm.addData("Vijay", "80%");
		hm.addData("Ravi", "98%");
		hm.addData("Honey", "88%");
		hm.getSize();
	}
}