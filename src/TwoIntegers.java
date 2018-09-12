public class TwoIntegers 
{
	private int num1;
	private int num2;
	
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
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
		this.num2= num2;
	}
	public String arithmetic()
	{
		int sum = this.num1 + this.num2;
		int product = this.num1 * this.num2;
		int difference = this.num1 - this.num2;
		int quotient = this.num1 / this.num2;
		return num1 + " + " + num2 + " = " + sum
		+ " // " + num1 + " * " + num2 + " = " + product
		+ " // " + num1 + " - " + num2 + " = " + difference
		+ " // " + num1 + " / " + num2 + " = " + quotient;
	}
	public int larger()
	{
		if(num1 > num2)
		{
			return num1;
		}
		else if(num2 > num1)
		{
			return num2;
		}
		else
		{
			return num1;
		}
	}

	public boolean isEven()
	{
		if((num1 + num2) % 2 == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isMultiple()
	{
		if(num1 % num2 == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
