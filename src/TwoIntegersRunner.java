import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int input1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int input2 = input.nextInt();
		System.out.println("Your integers are " + input1 + " and " + input2 + ".");
		
		TwoIntegers pair = new TwoIntegers(input1, input2);
		
		String answers = pair.arithmetic();
		System.out.println(answers);
		
		int larger = pair.larger();
		System.out.println(larger + " is larger than the other integer.");
		
		boolean isEven = pair.isEven();
		System.out.println("The sum of the two integers is even = " + isEven + ".");
		
		boolean isMultiple = pair.isMultiple();
		System.out.println("The first integer is a multiple of the second integer = " + isMultiple + ".");
		
	}
}
