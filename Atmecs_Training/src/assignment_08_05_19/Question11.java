package assignment_08_05_19;
import java.util.*;
class HashMapSort{
	Map<String,Integer> obj;
	
	public HashMapSort() {
		obj = new HashMap<String, Integer>();
	}
	public void addData(String key,Integer value) {
		obj.put(key,value);
	}
	
	public void sortMap() {
		Comparator<String> com ;
		
		Map<String,Integer> sortedMap = new TreeMap<String,Integer>(
				new Comparator<String>() {	
					@Override
					public int compare(String o1, String o2) {
						return o1.compareTo(o2);
					}
				}
		);
		sortedMap.putAll(obj);
		System.out.println(sortedMap);
	}
	
	
}

public class Question11 {
	public static void main(String[] args) {
		HashMapSort hm = new HashMapSort();
		hm.addData("Ajay", 90);
		hm.addData("Vijay", 80);
		hm.addData("Ravi", 98);
		hm.addData("Honey", 88);
		hm.sortMap();
	}
}