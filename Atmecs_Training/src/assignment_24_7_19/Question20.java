package assignment_24_7_19;

import java.util.*;

class ArrayListToArray{
	ArrayList<Integer> arr;
	Integer[] ar; 
	public ArrayListToArray(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	public void convetToArray() {
		ar = arr.toArray(new Integer[arr.size()]);
	}
	
	public void display() {
		for(int i:ar) {
			System.out.println(i);
		}
	}
	
}
public class Question20 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(10);
		arr.add(100);
		arr.add(1000);
		
		ArrayListToArray obj = new ArrayListToArray(arr);
		obj.convetToArray();
		obj.display();
	}
}
