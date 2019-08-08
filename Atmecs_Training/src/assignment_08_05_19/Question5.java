package assignment_08_05_19;
import java.util.*;
class HashSetCheckElement{
	HashSet<Integer> obj;

	public HashSetCheckElement() {
		obj = new HashSet<Integer>();
	}

	public void addElement(int n) {
		obj.add(n);
	}
	
	public void checkElement(int n) {
		boolean flag = obj.contains(n);
		if(flag) {
			System.out.println("Element Found");
			return;
		}
		System.out.println("Element Not Found");
	}
}
public class Question5 {
	public static void main(String[] args) {
		HashSetCheckElement obj = new HashSetCheckElement();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(3);
		obj.addElement(4);
		obj.addElement(5);
		obj.addElement(6);
		
		obj.checkElement(1);
	}
}
