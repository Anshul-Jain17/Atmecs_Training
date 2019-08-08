package assignment_08_05_19;

import java.util.*;

class ArrayToArrayList{
	Integer arr[];
	public ArrayToArrayList(Integer[] arr) {
		this.arr = arr;
	}
	
	public void convetToArrayList() {
		List<Integer> obj = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(obj);
	}
}
public class Question7 {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,41,11,13,5};
		ArrayToArrayList obj = new ArrayToArrayList(arr);
		obj.convetToArrayList();
	}
}
