import java.util.Scanner; 
import java.util.Date;

class Jhg extends Cals
{

	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);		
				
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();		
		
		Jhg jhg = new Jhg();
		jhg.output(num1, num2);
		
		System.out.printf("������ : 11604435 ��ȣ��\n");
		System.out.printf("���� ��¥��  %tY�� %tm�� %td��\n", new Date(), new Date(), new Date());
				
		System.out.printf("\n������\n");
		System.out.printf("1. %d + %d : %d\n", num1, num2, sum);
		System.out.printf("2. %d - %d : %d\n", num1, num2, minu);
		System.out.printf("3. %d * %d : %d\n", num1, num2, multi);
		System.out.printf("4. %d / %d : %s\n", num1, num2, div);
		
	}

}

class Cals
{
	
	static int sum;
	static int minu;
	static int multi;
	static double div;
	
	
	public static void output(int i, int j)
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

	