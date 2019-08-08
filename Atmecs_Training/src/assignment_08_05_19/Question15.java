package assignment_08_05_19;
import java.util.*;
import java.io.*;
class HashMapSerialize{
	Map<String,String> obj;
	
	public HashMapSerialize() {
		obj = new HashMap<String, String>();
	}
	public void addData(String key,String value) {
		obj.put(key,value);
	}
	
	public void serialize() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hashmap.ser"));
			oos.writeObject(obj);
			
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

public class Question15 {
	public static void main(String[] args) {
		HashMapSerialize hm = new HashMapSerialize();
		hm.addData("Ajay", "90%");
		hm.addData("Vijay", "80%");
		hm.addData("Ravi", "98%");
		hm.addData("Honey", "88%");
		hm.serialize();
	}
}