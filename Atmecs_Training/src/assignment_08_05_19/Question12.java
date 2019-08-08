package assignment_08_05_19;

import java.util.*;

class ArrayListSort /*implements Comparable<ArrayListSort>*/{
		
	private int roll;
	private String name;
	private int age;
	
	public ArrayListSort(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public int compareTo(ArrayListSort o) {
//		return this.getName().compareTo(o.getName());
//	}
	
	@Override
	public String toString() {
		return "[roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Question12 {
	public static void main(String[] args) {
		ArrayList<ArrayListSort> arr = new ArrayList<>();
		arr.add(new ArrayListSort(500, "Anshul", 21));
		arr.add(new ArrayListSort(400, "Anshika", 20));
		arr.add(new ArrayListSort(300, "Kamal", 19));
		arr.add(new ArrayListSort(200, "CK", 18));
		
		Comparator<ArrayListSort> comparator = new Comparator<ArrayListSort>() {
			
			@Override
			public int compare(ArrayListSort o1, ArrayListSort o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(arr,comparator);
		
		
		
		for(ArrayListSort a:arr) {
			System.out.println(a);
		}
	}
}
