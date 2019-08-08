package assignment_08_05_19;
import java.util.*;
import java.util.Map.Entry;
class HashMapSortByValue{
	Map<String,Integer> obj;
	
	public HashMapSortByValue() {
		obj = new HashMap<String, Integer>();
	}
	public void addData(String key,Integer value) {
		obj.put(key,value);
	}
	
	public void sortMap() { 
		
		Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String,Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		
		List<Map.Entry<String, Integer>> sortedMap = new ArrayList<Map.Entry<String,Integer>>(obj.entrySet());
		
		Collections.sort(sortedMap,comparator);
		System.out.println(sortedMap);
	}
	
	
}

public class Question14 {
	public static void main(String[] args) {
		HashMapSortByValue hm = new HashMapSortByValue();
		hm.addData("Ajay", 90);
		hm.addData("Vijay", 80);
		hm.addData("Ravi", 98);
		hm.addData("Honey", 88);
		hm.sortMap();
	}
}