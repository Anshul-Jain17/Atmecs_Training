package assignment_23_7_19;
import java.util.Scanner;
class Alphabets{
	String input;

	public Alphabets(String input) {
		this.input = input;
	}
	
	public void checkVowelConsonant() {
		char ch;
		String result="";
		if(input.length()==1) {
			ch = input.charAt(0);
			if((int)ch>=65&&(int)ch<=90 || (int)ch>=97&&(int)ch<=122) {
				if(ch=='a' ||ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
					System.out.println("Vowel");
				}
				else
					System.out.println("Consonant");
			}	
			else {
				System.out.println("Enter alphabets only");
			}
		}
		else {
			System.out.println("Wrong Input!! Enter single character only");
		}
	}
}
public class Question8 {
	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		input = sc.next();
		Alphabets obj = new Alphabets(input);
		obj.checkVowelConsonant();
	}
}
