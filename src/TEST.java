
import java.util.Scanner;
public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("Enter an amount as a,e.g.,1.1: ");
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    System.out.print("Enter an amount as b, e.g.,1.23: ");
    double b = input.nextDouble();
    System.out.print("Enter an amount as c, e.g.,1.24: ");
    double c = input.nextDouble();
    double d = b * b - 4 * a * c;
    if (d >= 0 ) 
    		System.out.print((-b + Math.pow(d, 0.5))/(2 * a));
    		else 
    	System.out.print("this question has no answer");
}
}