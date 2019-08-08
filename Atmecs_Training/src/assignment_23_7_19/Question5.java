package assignment_23_7_19;
import java.util.Scanner;
class DayName{
	int dayNo;

	public DayName(int dayNo) {
		this.dayNo = dayNo;
	}
	
	public void getDayName() {
		String dayName;
		switch(dayNo){
			case 1:dayName="Monday";break;
			case 2:dayName="Tuesday";break;
			case 3:dayName="Wednesday";break;
			case 4:dayName="Thursday";break;
			case 5:dayName="Friday";break;
			case 6:dayName="Saturday";break;
			case 7:dayName="Sunday";break;
			default:dayName="Invalid Input";
		}
		System.out.println(dayName);
	}
	
}
public class Question5 {

	public static void main(String[] args) {
		int dayNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 - 7");
		dayNo = sc.nextInt();
		new DayName(dayNo).getDayName();
	}
}
