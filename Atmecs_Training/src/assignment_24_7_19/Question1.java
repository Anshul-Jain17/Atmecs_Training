package assignment_24_7_19;
import java.util.Arrays;
import java.util.Scanner;
class NumericAndStringArray{
	int[] arr1;
	String[] arr2;
	
	Scanner sc = new Scanner(System.in);
	
	public void createArray() {
		int intlen,stringlen;
		System.out.println("Enter length of Integer array");
		intlen = sc.nextInt();
		System.out.println("Enter length of String array");
		stringlen = sc.nextInt();
		
		arr1 = new int[intlen];
		arr2= new String[stringlen];
	
	}
	
	public void takeInput(String[] arr1,int[] arr2) {
		System.out.println("Enter value in String array");
		for(int i=0;i<arr1.length;i++) {
			System.out.print("Enter the value: ");
			arr1[i] = sc.next();
		}
		System.out.println("Enter value in integer array");
		for(int i=0;i<arr2.length;i++) {
			System.out.print("Enter the value: ");
			arr2[i] = sc.nextInt();
		}
	}
	
	public void sort() {
		createArray();
		takeInput(arr2,arr1);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[j]<arr1[i]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[j].compareTo(arr2[i])<0) {
					String temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		display();
	}
	
	public void display() {
		System.out.println("Sorted integer array");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println("\nSorted String array");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
			
		}
	}
	
}
public class Question1 {
	public static void main(String[] args) {
		NumericAndStringArray obj = new NumericAndStringArray();
		obj.sort();
	}
}
