package assignment_08_05_19;
import java.util.*;
class ArrayListTraversal{
	ArrayList<Integer> obj;

	public ArrayListTraversal() {
		obj = new ArrayList<Integer>();
	}

	public void addElement(int n) {
		obj.add(n);
	}
	
	public void traverseArrayList() {
		Iterator<Integer> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
public class Question1 {
	public static void main(String[] args) {
		ArrayListTraversal obj = new ArrayListTraversal();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(3);
		obj.addElement(4);
		obj.addElement(5);
		obj.addElement(6);
		
		obj.traverseArrayList();
	}
}
