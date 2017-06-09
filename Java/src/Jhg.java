import java.util.Scanner; 
import java.util.Date;

class Jhg extends Cals
{

	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);		
				
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();		
		
		Jhg jhg = new Jhg();
		jhg.output(num1, num2);
		
		System.out.printf("실행자 : 11604435 지호근\n");
		System.out.printf("오늘 날짜는  %tY년 %tm월 %td일\n", new Date(), new Date(), new Date());
				
		System.out.printf("\n실행결과\n");
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
			System.out.print("0으로 나눌 수 없습니다.");
		}
	
	}
	
}

	