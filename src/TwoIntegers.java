public class TwoIntegers 
{
	private int num1;
	private int num2;
	
	public TwoIntegers()
	{
		num1 = -1;
		num2 = -1;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic(int sum, int product, int difference, int quotient)
	{
		sum = num1 + num2;
		product = num1 * num2;
		difference = num1 / num2;
		quotient = num1 % num2;
		
		return num1 + "+" + num2 + "=" + sum + ", " 
		+ num1 + "*" + num2 + "=" + product + ", " 
		+ num1 + "/" + num2 + "=" + difference + ", " 
		+ num1 + "%" + num2 + "=" + quotient + ", ";
	}
	public int larger()
	{
		if(num1 > num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
	public boolean isEven(int sum)
	{
		if(sum % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean multiples()
	{
		if(num1 % num2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
