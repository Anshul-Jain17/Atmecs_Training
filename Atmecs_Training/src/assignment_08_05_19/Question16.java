package assignment_08_05_19;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class SynchronizeHashMap{
	Map<String,Integer> map;

	public SynchronizeHashMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	public void sync() {
		ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<String, Integer>(map);
		Iterator<String> itr = cmap.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(cmap.get(itr.next()));
		}
	}
}
public class Question16 {
	public static void main(String[] args) {
		HashMap<String,Integer> hmap = new HashMap<String, Integer>();
		hmap.put("English", 88);
		hmap.put("Maths", 90);
		hmap.put("Science", 90);
		hmap.put("Hindi", 90);
		hmap.put("Computer", 90);
		
		SynchronizeHashMap shmap = new SynchronizeHashMap(hmap);
		shmap.sync();
	}
}
