package scu;

import java.util.Scanner; 

public class jhg
{
	static int sum=0;
	static int minu=0;
	static int multi=0;
	static double div=0;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();		
				
		output(num1, num2);
		System.out.print("num1 + num2 : "+sum);
		System.out.print("\nnum1 - num2 : "+minu);
		System.out.print("\nnum1 * num2 : "+multi);
		System.out.print("\nnum1 / num2 : "+div);
	}

	private static void output(int i, int j)
	{
		try
		{
			sum = i + j;
			minu = i - j;
			multi = i * j;
			div = i / j;
		}
		catch(ArithmeticException ae)
		{
			System.out.print("0���� ���� �� �����ϴ�.");
		}
	
	
	}
	
	
}