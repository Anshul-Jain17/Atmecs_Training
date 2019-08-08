package assignment_23_7_19;
import java.util.Scanner;
import java.math.*;

class Absolute{
	float val;
	
	public Absolute(float val) {
		this.val = val;
	}

	public String checkAbsolute(float num) {
		String res="";
		if(Math.abs(num)<1)
			res = "small ";
		else if(Math.abs(num)>1000000)
			res = "large ";
		return res;
	}
	
	public void checkPosNeg() {
		String res="";
		if(val==0)
			res = "zero";
		else if(val>0) {
			res = checkAbsolute(val)+"positive";
		}
		else {
			res = checkAbsolute(val)+"negative";
		}
		System.out.println(res);
	}
}
public class Question4 {
	
	public static void main(String[] args) {
		float val;
		Scanner sc = new Scanner(System.in);
		val = sc.nextFloat();
		new Absolute(val).checkPosNeg();
	}	
}
