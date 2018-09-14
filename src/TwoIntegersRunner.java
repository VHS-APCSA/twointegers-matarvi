import java.util.Scanner;

public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input 2 numbers: ");
		int value1 = input.nextInt();
		int value2 = input.nextInt();
		TwoIntegers ti = new TwoIntegers(value1, value2);
		String arithmetic = ti.arithmetic();
		int larger = ti.larger();
		boolean even = ti.isEven();
		boolean multiple = ti.multiples();
		System.out.println(arithmetic);
		System.out.println(larger + " is larger.");
		System.out.println("Is the sum even? " + even);
		System.out.println("Is the first number a multiple of the second number? " + multiple);
	}
}
