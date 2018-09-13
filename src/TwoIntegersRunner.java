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
	}
}
