package assignment_23_7_19;

import java.util.Scanner;
class LeapYear{
	int year;

	public LeapYear(int year) {
		this.year = year;
	}
	
	public void checkLeapYear() {
		if(year%4==0&& year%100!=0 || year%100==0&&year%400==0)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
}
public class Question9 {
	public static void main(String[] args) {
		int year=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year=sc.nextInt();
		LeapYear obj = new LeapYear(year);
		obj.checkLeapYear();
	}
}
