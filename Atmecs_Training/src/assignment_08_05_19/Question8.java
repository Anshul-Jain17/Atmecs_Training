package assignment_08_05_19;
import java.util.*;
class ArrayListSize{
	ArrayList<Integer> obj;

	public ArrayListSize() {
		obj = new ArrayList<Integer>();
	}

	public void addElement(int n) {
		obj.add(n);
	}
	
	public void findLength() {
		System.out.println("Size = "+obj.size());
	}
}
public class Question8 {
	public static void main(String[] args) {
		ArrayListSize obj = new ArrayListSize();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(3);
		obj.addElement(4);
		obj.addElement(5);
		obj.addElement(6);
		
		obj.findLength();
	}
}
