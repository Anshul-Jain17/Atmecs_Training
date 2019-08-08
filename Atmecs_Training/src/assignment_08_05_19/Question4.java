package assignment_08_05_19;
import java.util.*;
class ArrayListCheckElement{
	ArrayList<Integer> obj;

	public ArrayListCheckElement() {
		obj = new ArrayList<Integer>();
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
public class Question4 {
	public static void main(String[] args) {
		ArrayListCheckElement obj = new ArrayListCheckElement();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(3);
		obj.addElement(4);
		obj.addElement(5);
		obj.addElement(6);
		
		obj.checkElement(1);
	}
}
