package Chapter1;
import java.util.*;
public class P1_1_5 {
	public static void main(String[] args) {
		
		System.out.println("Please enter 2 integer to do next step:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		isTrue(a,b);
	}

	public static void isTrue(double a, double b){
		if ((a>0 && a<1) && (b>0 && b<1))
			System.out.println("True");
		else
			System.out.println("False");
	}
}