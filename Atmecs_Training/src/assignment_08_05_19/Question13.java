package assignment_08_05_19;
import java.util.*;
class ArrayListInsertion{
	ArrayList<Integer> obj;

	public ArrayListInsertion() {
		obj = new ArrayList<Integer>();
	}

	public void addElement(int n) {
		obj.add(n);
	}
	
	public void addElement(int index,int element) {
		obj.add(index, element);
	}
	
	public void traverseArrayList() {
		Iterator<Integer> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
public class Question13 {
	public static void main(String[] args) {
		ArrayListInsertion obj = new ArrayListInsertion();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(1,3);
		obj.addElement(4);
		obj.addElement(5);
		obj.addElement(2,6);
		
		obj.traverseArrayList();
	}
}
