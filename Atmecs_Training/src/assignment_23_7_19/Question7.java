package assignment_23_7_19;

import java.util.Scanner;
class DaysInMonth{
	int year,month;
	
	public DaysInMonth(int year, int month) {
		super();
		this.year = year;
		this.month = month;
	}
	
	public boolean checkLeapYear(int year) {
		if(year%4==0&& year%100!=0 || year%100==0&&year%400==0)
			return true;
		else
			return false;
	}
	public String monthName(int month) {
		String monthName="";
		switch(month) {
		case 1: monthName="January";break;
		case 2: monthName="February";break;
		case 3: monthName="March";break;
		case 4:monthName="April";break;
		case 5:monthName="May";break;
		case 6:monthName="June";break;
		case 7:monthName="July";break;
		case 8:monthName="August";break;
		case 9:monthName="September";break;
		case 10:monthName="October";break;
		case 11:monthName="November";break;
		case 12:monthName="December";break;
		}
		return monthName;
	}
	public void getDays() {
		boolean leapyear;
		int days=0;
		leapyear = checkLeapYear(year);
		switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:days = 31;break;
			case 4:case 6:case 9:case 11:days=30;break;
			case 2:
				if(leapyear)
					days=29;
				else	
					days=28;
		}
		System.out.println(monthName(month)+" "+year+" has "+days+" days");
	}
}
public class Question7 {
	
	public static void main(String[] args) {
		int year,month,days=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a month number: ");
		month = sc.nextInt();
		System.out.print("Input a year: ");
		year = sc.nextInt();
		DaysInMonth obj = new DaysInMonth(year, month);
		obj.getDays();
	}
}
//1,3,5,7,8,10,12 = 31
//4,6,9,11 =30
//2 = 28 or 29 