package scu;

public class jhg
{
	static int sum;
	static int minu;
	static int multi;
	static int div;

	public static void main(String[] args)
	{
		output(50,50);
		System.out.print("num1 + num2 : "+sum);
		System.out.print("\nnum1 - num2 : "+minu);
		System.out.print("\nnum1 * num2 : "+multi);
		System.out.print("\nnum1 / num2 : "+div);
	}

	private static void output(int i, int j)
	{
		if(i == 0 || j == 0)
		{
			return;
		}
		else
		{
			sum = i + j;
			minu = i - j;
			multi = i * j;
			div = i / j;
		}
	}
	
}